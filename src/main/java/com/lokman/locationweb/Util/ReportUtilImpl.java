package com.lokman.locationweb.Util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePieChart(String path, List<Object[]> data) {

		// convert data object to dataset

		DefaultPieDataset pieDataset = new DefaultPieDataset();

		for (Object[] objects : data) {
			pieDataset.setValue(objects[0].toString(), Double.valueOf(objects[1].toString()));
		}

		// chartfactory to create piechart

		JFreeChart pieChart = ChartFactory.createPieChart("Location Type report", pieDataset, false, false, false);

		// convert piechart to jpeg using chartutilities

		try {
			ChartUtilities.saveChartAsJPEG(new File(path + "/piechart.jpeg"), pieChart, 300, 300);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

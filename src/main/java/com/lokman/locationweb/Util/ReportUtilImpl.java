package com.lokman.locationweb.Util;

import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePieChart(String path, List<Object[]> data) {

		// convert data to dataset

		DefaultPieDataset pieDataset = new DefaultPieDataset();

		for (Object[] objects : data) {
			pieDataset.setValue(objects[0].toString(), Double.valueOf(objects[1].toString()));
		}

		// chartfactory to create piechart

		ChartFactory.createPieChart("Location Type report", pieDataset, false, false, false);

		// convert piechart to jpg using chartutilities

	}

}

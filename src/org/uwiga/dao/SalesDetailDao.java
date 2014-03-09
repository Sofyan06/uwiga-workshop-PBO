package org.uwiga.dao;

import java.util.List;

import org.uwiga.model.SalesDetail;
import org.uwiga.model.SalesHeader;

public interface SalesDetailDao {
	void saveOrUpdateDetail(SalesDetail o);

	void deleteDetail(SalesDetail o);

	List<SalesDetail> findAllDetail();

	List<SalesDetail> findByIdDetail();
}

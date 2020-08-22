package com.yc.damai.bean;

import java.util.List;

public class DmOrderitem {
    private Integer id;

    private Integer count;

    private Double total;

    private Integer pid;

    private Integer oid;
    
    private DmProduct dmproduct;
    
    public DmProduct getDmproduct() {
		return dmproduct;
	}

	public void setDmproduct(DmProduct dmproduct) {
		this.dmproduct = dmproduct;
	}

	private List<DmOrderitem> dmOrderitem;
    

	public List<DmOrderitem> getDmOrderitem() {
		return dmOrderitem;
	}

	public void setDmOrderitem(List<DmOrderitem> dmOrderitem) {
		this.dmOrderitem = dmOrderitem;
	}

	private List<DmProduct> dmProduct;
   

    public List<DmProduct> getDmProduct() {
		return  dmProduct;
	}

	public void setDmProduct(List<DmProduct> dmProduct) {
		this.dmProduct = dmProduct;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}
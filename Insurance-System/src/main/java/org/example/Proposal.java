package org.example;

/**
 * @author USER
 * @version 1.0
 */
public class Proposal {
	private int ProposalId;
	private String Title;

	public int getProposalId() {
		return ProposalId;
	}

	public void setProposalId(int proposalId) {
		ProposalId = proposalId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getMarketResearch() {
		return MarketResearch;
	}

	public void setMarketResearch(String marketResearch) {
		MarketResearch = marketResearch;
	}

	public String getInsurancePayment() {
		return InsurancePayment;
	}

	public void setInsurancePayment(String insurancePayment) {
		InsurancePayment = insurancePayment;
	}

	public String getProductOverview() {
		return ProductOverview;
	}

	public void setProductOverview(String productOverview) {
		ProductOverview = productOverview;
	}

	public org.example.SaleStrategy getSaleStrategy() {
		return SaleStrategy;
	}

	public void setSaleStrategy(org.example.SaleStrategy saleStrategy) {
		SaleStrategy = saleStrategy;
	}

	public org.example.SaleTarget getSaleTarget() {
		return SaleTarget;
	}

	public void setSaleTarget(org.example.SaleTarget saleTarget) {
		SaleTarget = saleTarget;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	private String MarketResearch;
	private String InsurancePayment;

	private String ProductOverview;

	private SaleStrategy SaleStrategy;
	private SaleTarget SaleTarget;

	public Reward reward;

	public Proposal(){

	}

	public void finalize() throws Throwable {

	}

}
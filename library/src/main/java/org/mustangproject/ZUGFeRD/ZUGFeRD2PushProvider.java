/**
 * *********************************************************************
 * <p>
 * Copyright 2018 Jochen Staerk
 * <p>
 * Use is subject to license terms.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0.
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * <p>
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * **********************************************************************
 */
package org.mustangproject.ZUGFeRD;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class ZUGFeRD2PushProvider implements IZUGFeRDExportableTransaction {

	protected String documentName = null, documentCode = null, number = null, ownOrganisationFullPlaintextInfo = null, referenceNumber = null, shipToOrganisationID = null, shipToOrganisationName = null, shipToStreet = null, shipToZIP = null, shipToLocation = null, shipToCountry = null, buyerOrderReferencedDocumentID = null, buyerOrderReferencedDocumentIssueDateTime = null, ownTaxID = null, ownVATID = null, ownForeignOrganisationID = null, ownOrganisationName = null, ownStreet = null, ownZIP = null, ownLocation = null, ownCountry = null, currency = null, paymentTermDescription = null;
	protected Date issueDate = null, dueDate = null, deliveryDate = null;
	protected BigDecimal totalPrepaidAmount = null;
	protected IZUGFeRDExportableContact ownContact = null, recipient = null, deliveryAddress = null;
	protected ArrayList<IZUGFeRDExportableItem> ZFItems = null;

	protected IZUGFeRDAllowanceCharge[] ZFAllowances = null, ZFCharges = null, ZFLogisticsServiceCharges = null;
	protected IZUGFeRDTradeSettlement[] getTradeSettlement = null;
	protected IZUGFeRDPaymentTerms paymentTerms = null;


	public ZUGFeRD2PushProvider() {
		ZFItems = new ArrayList<IZUGFeRDExportableItem>();
	}

	@Override
	public String getDocumentName() {
		return documentName;
	}

	public ZUGFeRD2PushProvider setDocumentName(String documentName) {
		this.documentName = documentName;
		return this;
	}

	@Override
	public String getDocumentCode() {
		return documentCode;
	}

	public ZUGFeRD2PushProvider setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
		return this;
	}

	@Override
	public String getNumber() {
		return number;
	}

	public ZUGFeRD2PushProvider setNumber(String number) {
		this.number = number;
		return this;
	}

	@Override
	public String getOwnOrganisationFullPlaintextInfo() {
		return ownOrganisationFullPlaintextInfo;
	}

	public ZUGFeRD2PushProvider setOwnOrganisationFullPlaintextInfo(String ownOrganisationFullPlaintextInfo) {
		this.ownOrganisationFullPlaintextInfo = ownOrganisationFullPlaintextInfo;
		return this;
	}

	@Override
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public ZUGFeRD2PushProvider setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	@Override
	public String getShipToOrganisationID() {
		return shipToOrganisationID;
	}

	public ZUGFeRD2PushProvider setShipToOrganisationID(String shipToOrganisationID) {
		this.shipToOrganisationID = shipToOrganisationID;
		return this;
	}

	@Override
	public String getShipToOrganisationName() {
		return shipToOrganisationName;
	}

	public ZUGFeRD2PushProvider setShipToOrganisationName(String shipToOrganisationName) {
		this.shipToOrganisationName = shipToOrganisationName;
		return this;
	}

	@Override
	public String getShipToStreet() {
		return shipToStreet;
	}

	public ZUGFeRD2PushProvider setShipToStreet(String shipToStreet) {
		this.shipToStreet = shipToStreet;
		return this;
	}

	@Override
	public String getShipToZIP() {
		return shipToZIP;
	}

	public ZUGFeRD2PushProvider setShipToZIP(String shipToZIP) {
		this.shipToZIP = shipToZIP;
		return this;
	}

	@Override
	public String getShipToLocation() {
		return shipToLocation;
	}

	public ZUGFeRD2PushProvider setShipToLocation(String shipToLocation) {
		this.shipToLocation = shipToLocation;
		return this;
	}

	@Override
	public String getShipToCountry() {
		return shipToCountry;
	}

	public ZUGFeRD2PushProvider setShipToCountry(String shipToCountry) {
		this.shipToCountry = shipToCountry;
		return this;
	}

	@Override
	public String getBuyerOrderReferencedDocumentID() {
		return buyerOrderReferencedDocumentID;
	}

	public ZUGFeRD2PushProvider setBuyerOrderReferencedDocumentID(String buyerOrderReferencedDocumentID) {
		this.buyerOrderReferencedDocumentID = buyerOrderReferencedDocumentID;
		return this;
	}

	@Override
	public String getBuyerOrderReferencedDocumentIssueDateTime() {
		return buyerOrderReferencedDocumentIssueDateTime;
	}

	public ZUGFeRD2PushProvider setBuyerOrderReferencedDocumentIssueDateTime(String buyerOrderReferencedDocumentIssueDateTime) {
		this.buyerOrderReferencedDocumentIssueDateTime = buyerOrderReferencedDocumentIssueDateTime;
		return this;
	}

	@Override
	public String getOwnTaxID() {
		return ownTaxID;
	}

	public ZUGFeRD2PushProvider setOwnTaxID(String ownTaxID) {
		this.ownTaxID = ownTaxID;
		return this;
	}

	@Override
	public String getOwnVATID() {
		return ownVATID;
	}

	public ZUGFeRD2PushProvider setOwnVATID(String ownVATID) {
		this.ownVATID = ownVATID;
		return this;
	}

	@Override
	public String getOwnForeignOrganisationID() {
		return ownForeignOrganisationID;
	}

	public ZUGFeRD2PushProvider setOwnForeignOrganisationID(String ownForeignOrganisationID) {
		this.ownForeignOrganisationID = ownForeignOrganisationID;
		return this;
	}

	@Override
	public String getOwnOrganisationName() {
		return ownOrganisationName;
	}

	public ZUGFeRD2PushProvider setOwnOrganisationName(String ownOrganisationName) {
		this.ownOrganisationName = ownOrganisationName;
		return this;
	}

	@Override
	public String getOwnStreet() {
		return ownStreet;
	}

	public ZUGFeRD2PushProvider setOwnStreet(String ownStreet) {
		this.ownStreet = ownStreet;
		return this;
	}

	@Override
	public String getOwnZIP() {
		return ownZIP;
	}

	public ZUGFeRD2PushProvider setOwnZIP(String ownZIP) {
		this.ownZIP = ownZIP;
		return this;
	}

	public String getOwnLocation() {
		return ownLocation;
	}

	public ZUGFeRD2PushProvider setOwnLocation(String getOwnLocation) {
		this.ownLocation = getOwnLocation;
		return this;
	}

	public String getOwnCountry() {
		return ownCountry;
	}

	public ZUGFeRD2PushProvider setOwnCountry(String getOwnCountry) {
		this.ownCountry = getOwnCountry;
		return this;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	public ZUGFeRD2PushProvider setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@Override
	public String getPaymentTermDescription() {
		return paymentTermDescription;
	}

	public ZUGFeRD2PushProvider setPaymentTermDescription(String paymentTermDescription) {
		this.paymentTermDescription = paymentTermDescription;
		return this;
	}

	@Override
	public Date getIssueDate() {
		return issueDate;
	}

	public ZUGFeRD2PushProvider setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	@Override
	public Date getDueDate() {
		return dueDate;
	}

	public ZUGFeRD2PushProvider setDueDate(Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	@Override
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public ZUGFeRD2PushProvider setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	@Override
	public BigDecimal getTotalPrepaidAmount() {
		return totalPrepaidAmount;
	}

	public ZUGFeRD2PushProvider setTotalPrepaidAmount(BigDecimal totalPrepaidAmount) {
		this.totalPrepaidAmount = totalPrepaidAmount;
		return this;
	}

	@Override
	public IZUGFeRDExportableContact getOwnContact() {
		return ownContact;
	}

	public ZUGFeRD2PushProvider setOwnContact(IZUGFeRDExportableContact ownContact) {
		this.ownContact = ownContact;
		return this;
	}

	@Override
	public IZUGFeRDExportableContact getRecipient() {
		return recipient;
	}

	public ZUGFeRD2PushProvider setRecipient(IZUGFeRDExportableContact recipient) {
		this.recipient = recipient;
		return this;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFAllowances() {
		return ZFAllowances;
	}

	public ZUGFeRD2PushProvider setZFAllowances(IZUGFeRDAllowanceCharge[] ZFAllowances) {
		this.ZFAllowances = ZFAllowances;
		return this;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFCharges() {
		return ZFCharges;
	}

	public ZUGFeRD2PushProvider setZFCharges(IZUGFeRDAllowanceCharge[] ZFCharges) {
		this.ZFCharges = ZFCharges;
		return this;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFLogisticsServiceCharges() {
		return ZFLogisticsServiceCharges;
	}

	public ZUGFeRD2PushProvider setZFLogisticsServiceCharges(IZUGFeRDAllowanceCharge[] ZFLogisticsServiceCharges) {
		this.ZFLogisticsServiceCharges = ZFLogisticsServiceCharges;
		return this;
	}

	public IZUGFeRDTradeSettlement[] getGetTradeSettlement() {
		return getTradeSettlement;
	}

	public ZUGFeRD2PushProvider setGetTradeSettlement(IZUGFeRDTradeSettlement[] getTradeSettlement) {
		this.getTradeSettlement = getTradeSettlement;
		return this;
	}

	@Override
	public IZUGFeRDPaymentTerms getPaymentTerms() {
		return paymentTerms;
	}

	public ZUGFeRD2PushProvider setPaymentTerms(IZUGFeRDPaymentTerms paymentTerms) {
		this.paymentTerms = paymentTerms;
		return this;
	}

	@Override
	public IZUGFeRDExportableContact getDeliveryAddress() {
		return deliveryAddress;
	}

	public ZUGFeRD2PushProvider setDeliveryAddress(IZUGFeRDExportableContact deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		return this;
	}

	@Override
	public IZUGFeRDExportableItem[] getZFItems() {
		return ZFItems.toArray(new IZUGFeRDExportableItem[0]);
	}

	public ZUGFeRD2PushProvider addItem(IZUGFeRDExportableItem item) {
		ZFItems.add(item);
		return this;
	}


	public boolean isValid() {
		return (dueDate != null) && (ownZIP != null) && (ownStreet != null) && (ownLocation != null) && (ownCountry != null) && (ownTaxID != null) && (ownVATID != null) && (recipient != null);
		//contact
		//		this.phone = phone;
		//		this.email = email;
		//		this.street = street;
		//		this.zip = zip;
		//		this.location = location;
		//		this.country = country;
	}

}

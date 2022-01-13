/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bdcc;

public interface BanqueService extends java.rmi.Remote {
    public bdcc.Compte[] getListCompte() throws java.rmi.RemoteException;
    public bdcc.Compte getCompte(int code) throws java.rmi.RemoteException;
    public double conversionEuroToDh(double montant, double dollar) throws java.rmi.RemoteException;
}

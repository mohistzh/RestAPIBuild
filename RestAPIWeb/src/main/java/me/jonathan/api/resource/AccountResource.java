package me.jonathan.api.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import me.jonathan.api.entity.Account;
import me.jonathan.sp.AccountManagement;
import me.jonathan.sp.impl.AccountManagementImpl;

/**
 * account api, url(/account)
 * 
 * @author Jonathan Zhang<br>
 *         mohistzh@gmail.com
 * @since Mar 21, 2014
 * @version
 */
@Path("account")
public class AccountResource {
	/**
	 * Get account entity by account id
	 * 
	 * @param id
	 * @return me.jonathan.api.entity.Account
	 */
	@GET
	@Path("/{id}")
	public Account getAccountById(@PathParam("id") Integer id) {
		AccountManagement am = new AccountManagementImpl();
		me.jonathan.sp.bean.Account account = am.getAccountById(id);
		return new Account(account.getId(), account.getName(),
				account.getEmail(), account.getAddress());

	}
}

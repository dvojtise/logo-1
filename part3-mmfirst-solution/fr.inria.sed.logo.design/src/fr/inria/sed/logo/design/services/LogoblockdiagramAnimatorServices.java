package fr.inria.sed.logo.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gemoc.executionframework.extensions.sirius.services.AbstractGemocAnimatorServices;

public class LogoblockdiagramAnimatorServices extends AbstractGemocAnimatorServices {

	@Override
	protected List<StringCouple> getRepresentationRefreshList() {  
		final List<StringCouple> res = new ArrayList<StringCouple>();
		res.add(new StringCouple("LogoBlockDiagram", "Animation"));
		return res;
	}
}

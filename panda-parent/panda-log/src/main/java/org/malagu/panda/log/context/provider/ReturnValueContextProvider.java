package org.malagu.panda.log.context.provider;

import org.malagu.panda.log.annotation.LogDefinition;
import org.springframework.stereotype.Component;

/**
 *@author Kevin.yang
 *@since 2015年7月20日
 */
@Component
public class ReturnValueContextProvider extends AbstractContextProvider {

	@Override
	public Object getContext() {
		Object returnValue = contextHandler.get(RETURN_VALUE);
		LogDefinition logDefinition = (LogDefinition) contextHandler.get(LOG_DEFINITION);
		return getRealContext(returnValue, logDefinition.getDataPath());
	}

	@Override
	public boolean support(LogDefinition logDefinition) {
		return RETURN_VALUE.equals(logDefinition.getContext());
	}

}

/*
 * Copyright 2012 Hiromasa Horiguchi ( The University of Tokyo )
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.ac.u.tokyo.m.dpc.specific;

import jp.ac.u.tokyo.m.string.StringUtil;

public class LoadTermUtil {

	/**
	 * load-term 表現 "[foo]" を正規表現で検出するために "\\[", "\\]" で挟んだ文字列を生成します。
	 * 
	 * @return "\\[" + aTarget + "\\]"
	 */
	public static String quoteReplaceWord(String aTarget) {
		return StringUtil.quoteString(aTarget, SpecificConstants.FILES_REPLACE_WORD_OPENER, SpecificConstants.FILES_REPLACE_WORD_CLOSER);
	}

}

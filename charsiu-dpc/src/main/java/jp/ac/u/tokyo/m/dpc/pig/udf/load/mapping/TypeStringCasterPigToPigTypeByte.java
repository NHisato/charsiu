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

package jp.ac.u.tokyo.m.dpc.pig.udf.load.mapping;

import jp.ac.u.tokyo.m.data.type.AbstractPigTypeStringCaster;

import org.apache.pig.data.DataType;

public class TypeStringCasterPigToPigTypeByte extends AbstractPigTypeStringCaster<Byte> {

	public static final TypeStringCasterPigToPigTypeByte INSTANCE = new TypeStringCasterPigToPigTypeByte();

	private TypeStringCasterPigToPigTypeByte() {}

	@Override
	public Byte caseDouble() {
		return DataType.DOUBLE;
	}

	@Override
	public Byte caseFloat() {
		return DataType.FLOAT;
	}

	@Override
	public Byte caseInt() {
		return DataType.INTEGER;
	}

	@Override
	public Byte caseLong() {
		return DataType.LONG;
	}

	@Override
	public Byte caseString() {
		return DataType.CHARARRAY;
	}

}

package com.fasterxml.jackson.databind.ser.std;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> {
    protected final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }
}

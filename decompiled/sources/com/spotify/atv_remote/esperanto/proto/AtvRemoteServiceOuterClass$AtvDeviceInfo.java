package com.spotify.atv_remote.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.hr6;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tr6;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AtvRemoteServiceOuterClass$AtvDeviceInfo extends AbstractC0269h implements sre0 {
    private static final AtvRemoteServiceOuterClass$AtvDeviceInfo DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    public static final int IP_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PAIRED_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int TXT_RECORDS_FIELD_NUMBER = 5;
    private boolean paired_;
    private int port_;
    private ihc0 txtRecords_ = ihc0.f102235b;
    private String name_ = "";
    private String host_ = "";
    private String ip_ = "";

    static {
        AtvRemoteServiceOuterClass$AtvDeviceInfo atvRemoteServiceOuterClass$AtvDeviceInfo = new AtvRemoteServiceOuterClass$AtvDeviceInfo();
        DEFAULT_INSTANCE = atvRemoteServiceOuterClass$AtvDeviceInfo;
        AbstractC0269h.registerDefaultInstance(AtvRemoteServiceOuterClass$AtvDeviceInfo.class, atvRemoteServiceOuterClass$AtvDeviceInfo);
    }

    private AtvRemoteServiceOuterClass$AtvDeviceInfo() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ȉ\u00052\u0006\u0007", new Object[]{"name_", "host_", "port_", "ip_", "txtRecords_", tr6.f222989a, "paired_"});
        }
        if (iOrdinal == 3) {
            return new AtvRemoteServiceOuterClass$AtvDeviceInfo();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 1);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (AtvRemoteServiceOuterClass$AtvDeviceInfo.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m3353n() {
        return this.host_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3354o() {
        return this.ip_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3355p() {
        return this.paired_;
    }

    /* JADX INFO: renamed from: q */
    public final int m3356q() {
        return this.port_;
    }

    /* JADX INFO: renamed from: r */
    public final Map m3357r() {
        return Collections.unmodifiableMap(this.txtRecords_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

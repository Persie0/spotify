package com.spotify.music.clientinfo.instrumentation.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ty3;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidClientReport extends AbstractC0269h implements sre0 {
    public static final int CERT_SIGNATURES_FIELD_NUMBER = 2;
    private static final AndroidClientReport DEFAULT_INSTANCE;
    public static final int INSTALLER_NAME_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String packageName_ = "";
    private ae50 certSignatures_ = AbstractC0269h.emptyProtobufList();
    private String installerName_ = "";

    static {
        AndroidClientReport androidClientReport = new AndroidClientReport();
        DEFAULT_INSTANCE = androidClientReport;
        AbstractC0269h.registerDefaultInstance(AndroidClientReport.class, androidClientReport);
    }

    private AndroidClientReport() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15691n(AndroidClientReport androidClientReport, ArrayList arrayList) {
        ae50 ae50Var = androidClientReport.certSignatures_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            androidClientReport.certSignatures_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, androidClientReport.certSignatures_);
    }

    /* JADX INFO: renamed from: o */
    public static void m15692o(AndroidClientReport androidClientReport, String str) {
        androidClientReport.getClass();
        androidClientReport.bitField0_ |= 2;
        androidClientReport.installerName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m15693p(AndroidClientReport androidClientReport, String str) {
        androidClientReport.getClass();
        str.getClass();
        androidClientReport.bitField0_ |= 1;
        androidClientReport.packageName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ty3 m15694q() {
        return (ty3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"bitField0_", "packageName_", "certSignatures_", "installerName_"});
        }
        if (iOrdinal == 3) {
            return new AndroidClientReport();
        }
        if (iOrdinal == 4) {
            return new ty3(DEFAULT_INSTANCE);
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
        synchronized (AndroidClientReport.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ResolvedBrowse extends AbstractC0269h implements sre0 {
    private static final ResolvedBrowse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_INFO_FIELD_NUMBER = 2;
    public static final int STRUCTURE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ResponseInfo responseInfo_;
    private BrowseStructure structure_;

    static {
        ResolvedBrowse resolvedBrowse = new ResolvedBrowse();
        DEFAULT_INSTANCE = resolvedBrowse;
        AbstractC0269h.registerDefaultInstance(ResolvedBrowse.class, resolvedBrowse);
    }

    private ResolvedBrowse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "structure_", "responseInfo_"});
        }
        if (iOrdinal == 3) {
            return new ResolvedBrowse();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 17);
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
        synchronized (ResolvedBrowse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ResponseInfo m4109n() {
        ResponseInfo responseInfo = this.responseInfo_;
        return responseInfo == null ? ResponseInfo.m4111n() : responseInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BrowseStructure m4110o() {
        BrowseStructure browseStructure = this.structure_;
        return browseStructure == null ? BrowseStructure.m4066n() : browseStructure;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

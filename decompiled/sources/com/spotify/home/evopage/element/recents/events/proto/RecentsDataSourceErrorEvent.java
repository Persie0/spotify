package com.spotify.home.evopage.element.recents.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y4v0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class RecentsDataSourceErrorEvent extends AbstractC0269h implements sre0 {
    private static final RecentsDataSourceErrorEvent DEFAULT_INSTANCE;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 1;
    public static final int PAGE_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String errorDescription_ = "";
    private String pageUri_ = "";

    static {
        RecentsDataSourceErrorEvent recentsDataSourceErrorEvent = new RecentsDataSourceErrorEvent();
        DEFAULT_INSTANCE = recentsDataSourceErrorEvent;
        AbstractC0269h.registerDefaultInstance(RecentsDataSourceErrorEvent.class, recentsDataSourceErrorEvent);
    }

    private RecentsDataSourceErrorEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11749n(RecentsDataSourceErrorEvent recentsDataSourceErrorEvent, String str) {
        recentsDataSourceErrorEvent.getClass();
        str.getClass();
        recentsDataSourceErrorEvent.bitField0_ |= 1;
        recentsDataSourceErrorEvent.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11750o(RecentsDataSourceErrorEvent recentsDataSourceErrorEvent, String str) {
        recentsDataSourceErrorEvent.getClass();
        recentsDataSourceErrorEvent.bitField0_ |= 2;
        recentsDataSourceErrorEvent.pageUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static y4v0 m11751p() {
        return (y4v0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "errorDescription_", "pageUri_"});
        }
        if (iOrdinal == 3) {
            return new RecentsDataSourceErrorEvent();
        }
        if (iOrdinal == 4) {
            return new y4v0(DEFAULT_INSTANCE);
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
        synchronized (RecentsDataSourceErrorEvent.class) {
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

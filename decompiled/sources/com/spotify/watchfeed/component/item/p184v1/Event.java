package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Event extends AbstractC0269h implements sre0 {
    public static final int DATE_WITH_OFFSET_FIELD_NUMBER = 4;
    private static final Event DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VENUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private DateWithOffset dateWithOffset_;
    private String uri_ = "";
    private String title_ = "";
    private String venue_ = "";

    static {
        Event event = new Event();
        DEFAULT_INSTANCE = event;
        AbstractC0269h.registerDefaultInstance(Event.class, event);
    }

    private Event() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "uri_", "title_", "venue_", "dateWithOffset_"});
        }
        if (iOrdinal == 3) {
            return new Event();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 20);
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
        synchronized (Event.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final DateWithOffset m22642n() {
        DateWithOffset dateWithOffset = this.dateWithOffset_;
        return dateWithOffset == null ? DateWithOffset.m22634o() : dateWithOffset;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22643o() {
        return this.venue_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

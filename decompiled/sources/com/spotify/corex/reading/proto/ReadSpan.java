package com.spotify.corex.reading.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ReadSpan extends AbstractC0269h implements sre0 {
    private static final ReadSpan DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 4;
    public static final int SECTIONS_FIELD_NUMBER = 3;
    public static final int SUB_NAME_FIELD_NUMBER = 8;
    public static final int SUB_URI_FIELD_NUMBER = 2;
    public static final int TIMELINE_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private PaginationLinks links_;
    private Progress progress_;
    private Timeline timeline_;
    private String uri_ = "";
    private String subUri_ = "";
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();
    private String name_ = "";
    private String subName_ = "";

    static {
        ReadSpan readSpan = new ReadSpan();
        DEFAULT_INSTANCE = readSpan;
        AbstractC0269h.registerDefaultInstance(ReadSpan.class, readSpan);
    }

    private ReadSpan() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static ReadSpan m8133t(byte[] bArr) {
        return (ReadSpan) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007Ȉ\bȈ", new Object[]{"bitField0_", "uri_", "subUri_", "sections_", Section.class, "progress_", "timeline_", "links_", "name_", "subName_"});
        }
        if (iOrdinal == 3) {
            return new ReadSpan();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 12);
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
        synchronized (ReadSpan.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final PaginationLinks m8134n() {
        PaginationLinks paginationLinks = this.links_;
        return paginationLinks == null ? PaginationLinks.m8127n() : paginationLinks;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Progress m8135o() {
        Progress progress = this.progress_;
        return progress == null ? Progress.m8130n() : progress;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m8136p() {
        return this.sections_;
    }

    /* JADX INFO: renamed from: q */
    public final String m8137q() {
        return this.subName_;
    }

    /* JADX INFO: renamed from: r */
    public final String m8138r() {
        return this.subUri_;
    }

    /* JADX INFO: renamed from: s */
    public final Timeline m8139s() {
        Timeline timeline = this.timeline_;
        return timeline == null ? Timeline.m8151n() : timeline;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.TranscriptFile;
import p204p.gva;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TranscriptRowComponent extends AbstractC0269h implements sre0 {
    private static final TranscriptRowComponent DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 4;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private TranscriptFile transcriptFile_;
    private String url_ = "";

    static {
        TranscriptRowComponent transcriptRowComponent = new TranscriptRowComponent();
        DEFAULT_INSTANCE = transcriptRowComponent;
        AbstractC0269h.registerDefaultInstance(TranscriptRowComponent.class, transcriptRowComponent);
    }

    private TranscriptRowComponent() {
    }

    /* JADX INFO: renamed from: o */
    public static TranscriptRowComponent m22739o(gva gvaVar) {
        return (TranscriptRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "url_", "transcriptFile_"});
        }
        if (iOrdinal == 3) {
            return new TranscriptRowComponent();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 23);
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
        synchronized (TranscriptRowComponent.class) {
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
    public final TranscriptFile m22740n() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.m22920n() : transcriptFile;
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

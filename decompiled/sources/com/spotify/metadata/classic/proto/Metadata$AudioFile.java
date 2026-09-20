package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.gva;
import p204p.m5f0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$AudioFile extends AbstractC0269h implements sre0 {
    private static final Metadata$AudioFile DEFAULT_INSTANCE;
    public static final int FILE_ID_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private gva fileId_ = gva.f84678b;
    private int format_;

    static {
        Metadata$AudioFile metadata$AudioFile = new Metadata$AudioFile();
        DEFAULT_INSTANCE = metadata$AudioFile;
        AbstractC0269h.registerDefaultInstance(Metadata$AudioFile.class, metadata$AudioFile);
    }

    private Metadata$AudioFile() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "fileId_", "format_", nq6.f157159p});
        }
        if (iOrdinal == 3) {
            return new Metadata$AudioFile();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 28);
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
        synchronized (Metadata$AudioFile.class) {
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
    public final gva m15351n() {
        return this.fileId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final m5f0 m15352o() {
        m5f0 m5f0VarM60862a = m5f0.m60862a(this.format_);
        return m5f0VarM60862a == null ? m5f0.OGG_VORBIS_96 : m5f0VarM60862a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

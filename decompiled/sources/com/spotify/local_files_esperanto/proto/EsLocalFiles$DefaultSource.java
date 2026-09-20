package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.clw;
import p204p.dlw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EsLocalFiles$DefaultSource extends AbstractC0269h implements sre0 {
    private static final EsLocalFiles$DefaultSource DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean enabled_;
    private int id_;

    static {
        EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = new EsLocalFiles$DefaultSource();
        DEFAULT_INSTANCE = esLocalFiles$DefaultSource;
        AbstractC0269h.registerDefaultInstance(EsLocalFiles$DefaultSource.class, esLocalFiles$DefaultSource);
    }

    private EsLocalFiles$DefaultSource() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13141n(EsLocalFiles$DefaultSource esLocalFiles$DefaultSource, boolean z) {
        esLocalFiles$DefaultSource.enabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13142o(EsLocalFiles$DefaultSource esLocalFiles$DefaultSource) {
        esLocalFiles$DefaultSource.getClass();
        esLocalFiles$DefaultSource.id_ = dlw.ANDROID_MEDIA_STORE.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static clw m13143q() {
        return (clw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"id_", "enabled_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$DefaultSource();
        }
        if (iOrdinal == 4) {
            return new clw(DEFAULT_INSTANCE);
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
        synchronized (EsLocalFiles$DefaultSource.class) {
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

    public final boolean getEnabled() {
        return this.enabled_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final dlw m13144p() {
        dlw dlwVar;
        switch (this.id_) {
            case 0:
                dlwVar = dlw.UNKNOWN;
                break;
            case 1:
                dlwVar = dlw.ITUNES;
                break;
            case 2:
                dlwVar = dlw.DOWNLOADS;
                break;
            case 3:
                dlwVar = dlw.MY_MUSIC;
                break;
            case 4:
                dlwVar = dlw.WINDOWS_MUSIC_LIBRARY;
                break;
            case 5:
                dlwVar = dlw.ANDROID_MEDIA_STORE;
                break;
            case 6:
                dlwVar = dlw.IOS_DOCUMENTS;
                break;
            default:
                dlwVar = null;
                break;
        }
        return dlwVar == null ? dlw.UNRECOGNIZED : dlwVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

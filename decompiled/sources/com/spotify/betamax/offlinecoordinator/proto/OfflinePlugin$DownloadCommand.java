package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class OfflinePlugin$DownloadCommand extends AbstractC0269h implements sre0 {
    private static final OfflinePlugin$DownloadCommand DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_FORMAT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String link_ = "";
    private OfflinePlugin$TargetFormat targetFormat_;

    static {
        OfflinePlugin$DownloadCommand offlinePlugin$DownloadCommand = new OfflinePlugin$DownloadCommand();
        DEFAULT_INSTANCE = offlinePlugin$DownloadCommand;
        AbstractC0269h.registerDefaultInstance(OfflinePlugin$DownloadCommand.class, offlinePlugin$DownloadCommand);
    }

    private OfflinePlugin$DownloadCommand() {
    }

    /* JADX INFO: renamed from: n */
    public static OfflinePlugin$DownloadCommand m3983n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "link_", "targetFormat_"});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$DownloadCommand();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 20);
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
        synchronized (OfflinePlugin$DownloadCommand.class) {
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

    public final String getLink() {
        return this.link_;
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

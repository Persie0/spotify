package com.spotify.betamax.offlinecoordinator.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z0k0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class OfflinePlugin$PluginCommand extends AbstractC0269h implements sre0 {
    private static final OfflinePlugin$PluginCommand DEFAULT_INSTANCE;
    public static final int DOWNLOAD_FIELD_NUMBER = 3;
    public static final int IDENTIFY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_FIELD_NUMBER = 4;
    public static final int STOP_DOWNLOAD_FIELD_NUMBER = 5;
    private Object command_;
    private int commandCase_ = 0;
    private String id_ = "";

    static {
        OfflinePlugin$PluginCommand offlinePlugin$PluginCommand = new OfflinePlugin$PluginCommand();
        DEFAULT_INSTANCE = offlinePlugin$PluginCommand;
        AbstractC0269h.registerDefaultInstance(OfflinePlugin$PluginCommand.class, offlinePlugin$PluginCommand);
    }

    private OfflinePlugin$PluginCommand() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"command_", "commandCase_", "id_", OfflinePlugin$IdentifyCommand.class, OfflinePlugin$DownloadCommand.class, OfflinePlugin$RemoveCommand.class, OfflinePlugin$StopDownloadCommand.class});
        }
        if (iOrdinal == 3) {
            return new OfflinePlugin$PluginCommand();
        }
        if (iOrdinal == 4) {
            return new bpj0(21);
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
        synchronized (OfflinePlugin$PluginCommand.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m3999o() {
        return z0k0.m95064a(this.commandCase_);
    }

    /* JADX INFO: renamed from: p */
    public final OfflinePlugin$DownloadCommand m4000p() {
        return this.commandCase_ == 3 ? (OfflinePlugin$DownloadCommand) this.command_ : OfflinePlugin$DownloadCommand.m3983n();
    }

    /* JADX INFO: renamed from: q */
    public final OfflinePlugin$IdentifyCommand m4001q() {
        return this.commandCase_ == 2 ? (OfflinePlugin$IdentifyCommand) this.command_ : OfflinePlugin$IdentifyCommand.m3990n();
    }

    /* JADX INFO: renamed from: r */
    public final OfflinePlugin$RemoveCommand m4002r() {
        return this.commandCase_ == 4 ? (OfflinePlugin$RemoveCommand) this.command_ : OfflinePlugin$RemoveCommand.m4013n();
    }

    /* JADX INFO: renamed from: s */
    public final OfflinePlugin$StopDownloadCommand m4003s() {
        return this.commandCase_ == 5 ? (OfflinePlugin$StopDownloadCommand) this.command_ : OfflinePlugin$StopDownloadCommand.m4015n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.deviceproxy.navigation.p059v1;

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
import p204p.u661;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SupportedNavigationCommand extends AbstractC0269h implements sre0 {
    public static final int COMMAND_FIELD_NUMBER = 1;
    private static final SupportedNavigationCommand DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_PATTERNS_FIELD_NUMBER = 2;
    private String command_ = "";
    private ae50 uriPatterns_ = AbstractC0269h.emptyProtobufList();

    static {
        SupportedNavigationCommand supportedNavigationCommand = new SupportedNavigationCommand();
        DEFAULT_INSTANCE = supportedNavigationCommand;
        AbstractC0269h.registerDefaultInstance(SupportedNavigationCommand.class, supportedNavigationCommand);
    }

    private SupportedNavigationCommand() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9300n(SupportedNavigationCommand supportedNavigationCommand, ArrayList arrayList) {
        ae50 ae50Var = supportedNavigationCommand.uriPatterns_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            supportedNavigationCommand.uriPatterns_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, supportedNavigationCommand.uriPatterns_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9301o(SupportedNavigationCommand supportedNavigationCommand) {
        supportedNavigationCommand.getClass();
        supportedNavigationCommand.command_ = "open";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static u661 m9302q() {
        return (u661) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"command_", "uriPatterns_", UriPattern.class});
        }
        if (iOrdinal == 3) {
            return new SupportedNavigationCommand();
        }
        if (iOrdinal == 4) {
            return new u661(DEFAULT_INSTANCE);
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
        synchronized (SupportedNavigationCommand.class) {
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

    /* JADX INFO: renamed from: p */
    public final int m9303p() {
        return this.uriPatterns_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import java.util.List;
import p204p.ae50;
import p204p.gva;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class HashtagRowComponent extends AbstractC0269h implements sre0 {
    private static final HashtagRowComponent DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        HashtagRowComponent hashtagRowComponent = new HashtagRowComponent();
        DEFAULT_INSTANCE = hashtagRowComponent;
        AbstractC0269h.registerDefaultInstance(HashtagRowComponent.class, hashtagRowComponent);
    }

    private HashtagRowComponent() {
    }

    /* JADX INFO: renamed from: n */
    public static HashtagRowComponent m22660n(gva gvaVar) {
        return (HashtagRowComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", Any.class});
        }
        if (iOrdinal == 3) {
            return new HashtagRowComponent();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 23);
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
        synchronized (HashtagRowComponent.class) {
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

    public final List getItemsList() {
        return this.items_;
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

package com.spotify.kidsentitybanning.search.p087v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ki30;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s690;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListViewRequest extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ListViewRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIEW_FIELD_NUMBER = 2;
    private String childId_ = "";
    private int view_;

    static {
        ListViewRequest listViewRequest = new ListViewRequest();
        DEFAULT_INSTANCE = listViewRequest;
        AbstractC0269h.registerDefaultInstance(ListViewRequest.class, listViewRequest);
    }

    private ListViewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12188n(ListViewRequest listViewRequest, String str) {
        listViewRequest.getClass();
        str.getClass();
        listViewRequest.childId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12189o(ListViewRequest listViewRequest, ki30 ki30Var) {
        listViewRequest.getClass();
        listViewRequest.view_ = ki30Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static s690 m12190p() {
        return (s690) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"childId_", "view_"});
        }
        if (iOrdinal == 3) {
            return new ListViewRequest();
        }
        if (iOrdinal == 4) {
            return new s690(DEFAULT_INSTANCE);
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
        synchronized (ListViewRequest.class) {
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

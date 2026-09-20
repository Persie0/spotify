package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListFilteringProto$StoredFilter extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER = 15;
    private static final ListFilteringProto$StoredFilter DEFAULT_INSTANCE;
    public static final int DESCRIPTOR_TAG_FIELD_NUMBER = 8;
    public static final int EXCLUDE_BANNED_FIELD_NUMBER = 6;
    public static final int EXCLUDE_EPISODES_FIELD_NUMBER = 10;
    public static final int EXCLUDE_EPISODE_TRAILERS_FIELD_NUMBER = 16;
    public static final int EXCLUDE_EXPLICIT_FIELD_NUMBER = 11;
    public static final int EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER = 19;
    public static final int EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER = 18;
    public static final int EXCLUDE_UNAVAILABLE_FIELD_NUMBER = 13;
    public static final int EXCLUDE_VIDEOS_FIELD_NUMBER = 5;
    public static final int FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER = 20;
    public static final int FULLY_PLAYED_ONLY_FIELD_NUMBER = 12;
    public static final int IN_PROGRESS_ONLY_FIELD_NUMBER = 9;
    public static final int NOT_FULLY_PLAYED_ONLY_FIELD_NUMBER = 14;
    public static final int NOT_LOCAL_TRACK_FIELD_NUMBER = 7;
    public static final int ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER = 17;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int UNPLAYED_ONLY_FIELD_NUMBER = 4;
    public static final int VIDEOS_ONLY_FIELD_NUMBER = 3;
    private int filterCase_ = 0;
    private Object filter_;

    static {
        ListFilteringProto$StoredFilter listFilteringProto$StoredFilter = new ListFilteringProto$StoredFilter();
        DEFAULT_INSTANCE = listFilteringProto$StoredFilter;
        AbstractC0269h.registerDefaultInstance(ListFilteringProto$StoredFilter.class, listFilteringProto$StoredFilter);
    }

    private ListFilteringProto$StoredFilter() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\bȻ\u0000\t:\u0000\n:\u0000\u000b:\u0000\f:\u0000\r:\u0000\u000e:\u0000\u000f:\u0000\u0010:\u0000\u0011:\u0000\u0012:\u0000\u0013:\u0000\u0014<\u0000", new Object[]{"filter_", "filterCase_", ListFilteringProto$FormatListAttributeKeysValue.class});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$StoredFilter();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 11);
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
        synchronized (ListFilteringProto$StoredFilter.class) {
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
    public final String m13003n() {
        return this.filterCase_ == 8 ? (String) this.filter_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m13004o() {
        switch (this.filterCase_) {
            case 0:
                return 21;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: p */
    public final ListFilteringProto$FormatListAttributeKeysValue m13005p() {
        return this.filterCase_ == 20 ? (ListFilteringProto$FormatListAttributeKeysValue) this.filter_ : ListFilteringProto$FormatListAttributeKeysValue.m12998n();
    }

    /* JADX INFO: renamed from: q */
    public final String m13006q() {
        return this.filterCase_ == 2 ? (String) this.filter_ : "";
    }

    /* JADX INFO: renamed from: r */
    public final String m13007r() {
        return this.filterCase_ == 1 ? (String) this.filter_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

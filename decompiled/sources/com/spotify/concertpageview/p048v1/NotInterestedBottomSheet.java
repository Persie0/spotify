package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import com.google.type.DateTime;
import p204p.ae50;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class NotInterestedBottomSheet extends AbstractC0269h implements sre0 {
    public static final int DATE_FIELD_NUMBER = 2;
    private static final NotInterestedBottomSheet DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private DateTime date_;
    private String imageUrl_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private ae50 options_ = AbstractC0269h.emptyProtobufList();

    static {
        NotInterestedBottomSheet notInterestedBottomSheet = new NotInterestedBottomSheet();
        DEFAULT_INSTANCE = notInterestedBottomSheet;
        AbstractC0269h.registerDefaultInstance(NotInterestedBottomSheet.class, notInterestedBottomSheet);
    }

    private NotInterestedBottomSheet() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005\u001b", new Object[]{"bitField0_", "imageUrl_", "date_", "title_", "subtitle_", "options_", NotInterestedOption.class});
        }
        if (iOrdinal == 3) {
            return new NotInterestedBottomSheet();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 1);
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
        synchronized (NotInterestedBottomSheet.class) {
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

package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes10.dex */
public final class InfoPanel extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 6;
    private static final InfoPanel DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISCLAIMER_FIELD_NUMBER = 4;
    public static final int DISCLAIMER_ICON_FIELD_NUMBER = 5;
    public static final int ENTRY_POINTS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private EntryPointCard entryPoints_;
    private String title_ = "";
    private String description_ = "";
    private String disclaimer_ = "";
    private String disclaimerIcon_ = "";
    private ae50 attributes_ = AbstractC0269h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        InfoPanel infoPanel = new InfoPanel();
        DEFAULT_INSTANCE = infoPanel;
        AbstractC0269h.registerDefaultInstance(InfoPanel.class, infoPanel);
    }

    private InfoPanel() {
    }

    /* JADX INFO: renamed from: o */
    public static InfoPanel m21754o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001d\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006\u001bdለ\u0003", new Object[]{"bitField0_", "title_", "description_", "entryPoints_", "disclaimer_", "disclaimerIcon_", "attributes_", InfoPanelAttribute.class, "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new InfoPanel();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 5);
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
        synchronized (InfoPanel.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final List m21755n() {
        return this.attributes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m21756p() {
        return this.disclaimer_;
    }

    /* JADX INFO: renamed from: q */
    public final EntryPointCard m21757q() {
        EntryPointCard entryPointCard = this.entryPoints_;
        return entryPointCard == null ? EntryPointCard.m21739n() : entryPointCard;
    }

    /* JADX INFO: renamed from: r */
    public final String m21758r() {
        return this.ubiId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}

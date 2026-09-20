package com.spotify.cosmos.util.proto;

import java.util.List;
import p204p.gva;
import p204p.pre0;
import p204p.sre0;

/* JADX INFO: loaded from: classes6.dex */
public interface ShowMetadataOrBuilder extends sre0 {
    String getConsumptionOrder();

    gva getConsumptionOrderBytes();

    String getCopyright(int i);

    gva getCopyrightBytes(int i);

    int getCopyrightCount();

    List<String> getCopyrightList();

    ImageGroup getCovers();

    @Override // p204p.sre0
    /* synthetic */ pre0 getDefaultInstanceForType();

    String getDescription();

    gva getDescriptionBytes();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    ShowListAttribute getFormatListAttributes(int i);

    int getFormatListAttributesCount();

    List<ShowListAttribute> getFormatListAttributesList();

    boolean getIsBook();

    boolean getIsCreatorChannel();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    String getLanguage();

    gva getLanguageBytes();

    String getLink();

    gva getLinkBytes();

    int getMediaTypeEnum();

    String getName();

    gva getNameBytes();

    int getNumEpisodes();

    int getPopularity();

    String getPublisher();

    gva getPublisherBytes();

    String getTrailerUri();

    gva getTrailerUriBytes();

    boolean hasConsumptionOrder();

    boolean hasCovers();

    boolean hasDescription();

    boolean hasIsBook();

    boolean hasIsCreatorChannel();

    boolean hasIsExplicit();

    boolean hasIsMusicAndTalk();

    boolean hasLanguage();

    boolean hasLink();

    boolean hasMediaTypeEnum();

    boolean hasName();

    boolean hasNumEpisodes();

    boolean hasPopularity();

    boolean hasPublisher();

    boolean hasTrailerUri();

    @Override // p204p.sre0
    /* synthetic */ boolean isInitialized();
}

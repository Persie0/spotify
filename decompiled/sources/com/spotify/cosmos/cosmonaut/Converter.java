package com.spotify.cosmos.cosmonaut;

import java.lang.reflect.Type;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000bJ\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J!\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/Converter;", "From", "To", "", "canHandle", "", "type", "Ljava/lang/reflect/Type;", "convert", "source", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;", "Factory", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Converter<From, To> {

    @Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0014\u0010\u0005\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0002\b\u00030\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "", "createRequestConverter", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "createResponseConverter", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public interface Factory {
        Converter<?, byte[]> createRequestConverter();

        Converter<byte[], ?> createResponseConverter();
    }

    boolean canHandle(Type type);

    To convert(Type type, From source);
}

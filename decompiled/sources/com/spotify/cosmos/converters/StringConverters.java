package com.spotify.cosmos.converters;

import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\t"}, m24212d2 = {"Lcom/spotify/cosmos/converters/StringConverters;", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "()V", "createRequestConverter", "Lcom/spotify/cosmos/cosmonaut/Converter;", "", "createResponseConverter", "Companion", "src_main_java_com_spotify_cosmos_converters-converters"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class StringConverters implements Converter.Factory {
    private static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<?, byte[]> createRequestConverter() {
        return new Converter<Object, byte[]>() { // from class: com.spotify.cosmos.converters.StringConverters.createRequestConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public byte[] convert(Type type, Object source) {
                String str = (String) source;
                wj50.m88279p(str);
                return str.getBytes(StringConverters.DEFAULT_CHARSET);
            }
        };
    }

    @Override // com.spotify.cosmos.cosmonaut.Converter.Factory
    public Converter<byte[], ?> createResponseConverter() {
        return new Converter<byte[], Object>() { // from class: com.spotify.cosmos.converters.StringConverters.createResponseConverter.1
            @Override // com.spotify.cosmos.cosmonaut.Converter
            public boolean canHandle(Type type) {
                return type.equals(String.class);
            }

            @Override // com.spotify.cosmos.cosmonaut.Converter
            public Object convert(Type type, byte[] source) {
                wj50.m88279p(source);
                return new String(source, StringConverters.DEFAULT_CHARSET);
            }
        };
    }
}

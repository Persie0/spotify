package com.spotify.cosmos.cosmonaut.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonaut/annotations/DELETE;", "", "value", "", "()Ljava/lang/String;", "src_main_java_com_spotify_cosmos_cosmonaut-cosmonaut"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public @interface DELETE {
    String value();
}

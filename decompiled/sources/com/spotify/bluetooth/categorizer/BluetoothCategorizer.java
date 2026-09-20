package com.spotify.bluetooth.categorizer;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.fbk;
import p204p.fiz;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/bluetooth/categorizer/BluetoothCategorizer;", "", "Lp/w2a1;", ContextTrack.TrackAction.STOP, "()V", "Lcom/spotify/externalintegration/externalaccessory/ExternalAccessoryDescription;", "description", "Lp/fiz;", "Lcom/spotify/bluetooth/categorizer/CategorizerResponse;", "categorizeAndUpdateCaches", "(Lcom/spotify/externalintegration/externalaccessory/ExternalAccessoryDescription;)Lp/fiz;", "", "deviceName", "(Ljava/lang/String;)Lp/fiz;", "categorize", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_bluetooth_categorizer-categorizer"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface BluetoothCategorizer {
    Object categorize(String str, fbk<? super CategorizerResponse> fbkVar);

    fiz categorizeAndUpdateCaches(ExternalAccessoryDescription description);

    fiz categorizeAndUpdateCaches(String deviceName);

    void stop();
}

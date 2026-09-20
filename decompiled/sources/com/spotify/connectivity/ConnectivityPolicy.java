package com.spotify.connectivity;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p204p.i1j;
import p204p.kkc0;
import p204p.lzv;
import p204p.nzv;
import p204p.pft0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/connectivity/ConnectivityPolicy;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "p/i1j", "DISALLOW_ALL", "ALLOW_ALL", "ALLOW_NON_PERSISTENT_CONNECTIONS", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum ConnectivityPolicy {
    DISALLOW_ALL(0),
    ALLOW_ALL(1),
    ALLOW_NON_PERSISTENT_CONNECTIONS(2);

    private static final Map<Integer, ConnectivityPolicy> BY_VALUE;
    private final int value;
    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());
    public static final i1j Companion = new i1j();

    static {
        ConnectivityPolicy[] connectivityPolicyArrValues = values();
        ArrayList arrayList = new ArrayList(connectivityPolicyArrValues.length);
        for (ConnectivityPolicy connectivityPolicy : connectivityPolicyArrValues) {
            arrayList.add(pft0.m69840u(Integer.valueOf(connectivityPolicy.value), connectivityPolicy));
        }
        BY_VALUE = kkc0.m56705r0(arrayList);
    }

    ConnectivityPolicy(int i) {
        this.value = i;
    }

    public static final ConnectivityPolicy connectivityPolicyOfValue(int i) {
        Companion.getClass();
        return (ConnectivityPolicy) BY_VALUE.get(Integer.valueOf(i));
    }

    public static lzv getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}

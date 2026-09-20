package com.comscore.android.p005id;

/* JADX INFO: loaded from: classes.dex */
public class CrossPublisherId {
    public final String crossPublisherId;
    public final int source;

    /* JADX INFO: loaded from: classes3.dex */
    public interface Source {
        public static final int ADID = 1;
        public static final int ANDROIDBUILDSERIAL = 2;
        public static final int ANDROIDID = 3;
        public static final int NotPresent = 0;
    }

    public CrossPublisherId(String str, int i) {
        this.crossPublisherId = str;
        this.source = i;
    }
}

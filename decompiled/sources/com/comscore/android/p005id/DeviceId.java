package com.comscore.android.p005id;

/* JADX INFO: loaded from: classes.dex */
public class DeviceId {
    public final int _source;

    /* JADX INFO: renamed from: a */
    private String f1534a;

    /* JADX INFO: renamed from: b */
    private String f1535b;

    /* JADX INFO: renamed from: c */
    private int f1536c;

    /* JADX INFO: renamed from: d */
    private int f1537d;

    /* JADX INFO: loaded from: classes3.dex */
    public interface Source {
        public static final int ANDROIDBUILDSERIAL = 1;
        public static final int ANDROIDID = 2;
        public static final int APPSETID_SCOPEAPP = 4;
        public static final int APPSETID_SCOPEDEVELOPER = 3;
        public static final int GUID = 0;
    }

    public DeviceId(String str, String str2, int i, int i2, int i3) {
        this.f1534a = str;
        this.f1535b = str2;
        this.f1536c = i;
        this.f1537d = i2;
        this._source = i3;
    }

    public int getCommonness() {
        return this.f1536c;
    }

    public String getId() {
        return this.f1535b;
    }

    public String getName() {
        return this.f1534a;
    }

    public int getPersistency() {
        return this.f1537d;
    }

    public int getSource() {
        return this._source;
    }

    public String getSuffix() {
        return getCommonness() + "" + getPersistency();
    }
}

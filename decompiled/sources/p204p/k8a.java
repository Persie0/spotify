package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class k8a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120273a = 2;

    /* JADX INFO: renamed from: b */
    public final String f120274b;

    /* JADX INFO: renamed from: c */
    public final String f120275c;

    public k8a(String str, String str2, int i, int i2, int i3) {
        this.f120274b = str;
        this.f120275c = str2;
        if (i2 > i || i > i3) {
            throw new IllegalArgumentException("Invalid value for this property model.");
        }
    }

    public k8a(String str, String str2, String str3, ArrayList arrayList) {
        this.f120274b = str;
        this.f120275c = str2;
        if (!arrayList.contains(str3)) {
            throw new IllegalArgumentException("Invalid value for this property model.");
        }
    }

    public k8a(String str, String str2, boolean z) {
        this.f120274b = str;
        this.f120275c = str2;
    }
}

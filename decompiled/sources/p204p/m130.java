package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m130 {

    /* JADX INFO: renamed from: a */
    public final l130 f138833a;

    /* JADX INFO: renamed from: b */
    public final HashMap f138834b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f138835c;

    /* JADX INFO: renamed from: d */
    public String f138836d;

    public m130(l130 l130Var, String str, Uri uri, int i) {
        this.f138833a = l130Var;
        HashMap map = new HashMap();
        this.f138834b = map;
        map.put(str, uri);
        this.f138836d = str;
        ArrayList arrayList = new ArrayList();
        this.f138835c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public final hg40 m60527a() {
        return hg40.m47406p(this.f138834b.keySet());
    }

    /* JADX INFO: renamed from: b */
    public final Uri m60528b() {
        Uri uri = (Uri) this.f138834b.get(this.f138836d);
        uri.getClass();
        return uri;
    }
}

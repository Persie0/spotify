package p204p;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h6f1 {

    /* JADX INFO: renamed from: a */
    public final mwf1 f88085a;

    public h6f1(mwf1 mwf1Var) {
        this.f88085a = mwf1Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m46723a(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) zzbk.zzd(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }
}

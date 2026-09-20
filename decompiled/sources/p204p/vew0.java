package p204p;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class vew0 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e */
    public static final h9p f240828e;

    /* JADX INFO: renamed from: a */
    public final RemoteViewsCompatService f240829a;

    /* JADX INFO: renamed from: b */
    public final int f240830b;

    /* JADX INFO: renamed from: c */
    public final int f240831c;

    /* JADX INFO: renamed from: d */
    public h9p f240832d = f240828e;

    static {
        long[] jArr = new long[0];
        RemoteViews[] remoteViewsArr = new RemoteViews[0];
        h9p h9pVar = new h9p();
        h9pVar.f89015c = jArr;
        h9pVar.f89016d = remoteViewsArr;
        h9pVar.f89014b = false;
        h9pVar.f89013a = 1;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = g6f.m43727j0(arrayList).size();
        if (size > 1) {
            throw new IllegalArgumentException(edb.m38563l("View type count is set to 1, but the collection contains ", size, " different layout ids").toString());
        }
        f240828e = h9pVar;
    }

    public vew0(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
        this.f240829a = remoteViewsCompatService;
        this.f240830b = i;
        this.f240831c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m85339a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f240829a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f240830b);
        sb.append(':');
        sb.append(this.f240831c);
        h9p h9pVar = null;
        String string = sharedPreferences.getString(sb.toString(), null);
        if (string != null) {
            byte[] bArrDecode = Base64.decode(string, 0);
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                byte[] bArr = new byte[parcelObtain.readInt()];
                parcelObtain.readByteArray(bArr);
                String string2 = parcelObtain.readString();
                wj50.m88279p(string2);
                long j = parcelObtain.readLong();
                parcelObtain.recycle();
                if (wj50.m88271j(Build.VERSION.INCREMENTAL, string2)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? r35.m74609q(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        lValueOf = null;
                    }
                    if (lValueOf != null && lValueOf.longValue() == j) {
                        try {
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                parcelObtain2.setDataPosition(0);
                                h9p h9pVar2 = new h9p(parcelObtain2);
                                parcelObtain2.recycle();
                                h9pVar = h9pVar2;
                            } catch (Throwable th) {
                                parcelObtain2.recycle();
                                throw th;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        if (h9pVar == null) {
            h9pVar = f240828e;
        }
        this.f240832d = h9pVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.f240832d.f89015c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return ((long[]) this.f240832d.f89015c)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return ((RemoteViews[]) this.f240832d.f89016d)[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f240829a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f240832d.f89013a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f240832d.f89014b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        m85339a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        m85339a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}

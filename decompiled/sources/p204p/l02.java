package p204p;

import android.content.Context;
import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.mobius.Connection;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l02 extends ri00 implements eh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f128256h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l02(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f128256h = i4;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f128256h) {
            case 0:
                return (a12) ((i4t0) this.f78014b).get();
            case 1:
                return Boolean.valueOf(((my8) this.f78014b).mo63164r1());
            case 2:
                return ((fx70) this.f78014b).f74287b.getValue();
            case 3:
                ((Connection) this.f78014b).dispose();
                return w2a1.f247311a;
            case 4:
                return (vyb) ((i4t0) this.f78014b).get();
            case 5:
                return (ApplicationScopeConfiguration) ((i4t0) this.f78014b).get();
            case 6:
                return (String) ((i4t0) this.f78014b).get();
            case 7:
                return (Context) ((i4t0) this.f78014b).get();
            case 8:
                return (e3p) ((i4t0) this.f78014b).get();
            case 9:
                return (mb80) ((i4t0) this.f78014b).get();
            case 10:
                return (bd31) ((i4t0) this.f78014b).get();
            case 11:
                return (e940) ((i4t0) this.f78014b).get();
            case 12:
                return (l6n0) ((i4t0) this.f78014b).get();
            case 13:
                return (mnl0) ((i4t0) this.f78014b).get();
            case 14:
                return (p231) ((i4t0) this.f78014b).get();
            case 15:
                return (Context) ((i4t0) this.f78014b).get();
            case 16:
                return (Scheduler) ((i4t0) this.f78014b).get();
            case 17:
                return (luk) ((i4t0) this.f78014b).get();
            case 18:
                return (fke) ((i4t0) this.f78014b).get();
            case 19:
                return (Set) ((i4t0) this.f78014b).get();
            case 20:
                return (mac) ((i4t0) this.f78014b).get();
            case 21:
                return (luk) ((i4t0) this.f78014b).get();
            case 22:
                return (FilterMetadataDatabase) ((i4t0) this.f78014b).get();
            case 23:
                return (bji) ((i4t0) this.f78014b).get();
            case 24:
                return (k530) ((i4t0) this.f78014b).get();
            case 25:
                return (Flowable) ((i4t0) this.f78014b).get();
            case 26:
                return (xre) ((i4t0) this.f78014b).get();
            case 27:
                return (Scheduler) ((i4t0) this.f78014b).get();
            case 28:
                return (w8b) ((i4t0) this.f78014b).get();
            default:
                return (Context) ((i4t0) this.f78014b).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l02(i4t0 i4t0Var, int i) {
        super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
        this.f128256h = i;
        switch (i) {
            case 8:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 9:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 10:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 11:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 12:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 13:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 14:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 24:
            case 26:
            case 27:
            case 28:
            default:
                break;
            case 19:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 20:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 22:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 23:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 25:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
            case 29:
                super(0, i4t0Var, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0);
                break;
        }
    }
}

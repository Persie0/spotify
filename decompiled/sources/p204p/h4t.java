package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class h4t implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j5y0 f87645b;

    public /* synthetic */ h4t(j5y0 j5y0Var, int i) {
        this.f87644a = i;
        this.f87645b = j5y0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        String path;
        String path2;
        switch (this.f87644a) {
            case 0:
                ((r6y0) this.f87645b).f196382g.onNext(z5y0.f279659a);
                break;
            case 1:
                a4t a4tVar = (a4t) obj;
                String str = a4tVar.f12306b;
                String str2 = a4tVar.f12307c;
                if (str2 != null) {
                    path = Uri.parse(str2).getPath();
                    if (path == null) {
                        path = "";
                    }
                } else {
                    path = null;
                }
                String str3 = path;
                String str4 = a4tVar.f12310f;
                String str5 = a4tVar.f12311g;
                Boolean bool = a4tVar.f12312h;
                Integer num = a4tVar.f12309e;
                String str6 = a4tVar.f12308d;
                r6y0 r6y0Var = (r6y0) this.f87645b;
                r6y0Var.f196387l = true;
                r6y0Var.m74878a();
                r6y0Var.f196376a.mo23384c(new p6y0(r6y0Var, str, str3, str4, str5, bool, num, str6));
                break;
            default:
                eor0 eor0Var = (eor0) obj;
                String str7 = eor0Var.f61464a;
                String str8 = eor0Var.f61465b;
                if (str8 != null) {
                    path2 = Uri.parse(str8).getPath();
                    if (path2 == null) {
                        path2 = "";
                    }
                } else {
                    path2 = null;
                }
                String str9 = path2;
                r6y0 r6y0Var2 = (r6y0) this.f87645b;
                r6y0Var2.f196387l = true;
                r6y0Var2.m74878a();
                r6y0Var2.f196376a.mo23384c(new p6y0(r6y0Var2, str7, str9, null, null, null, null, null));
                break;
        }
    }
}

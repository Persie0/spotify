package p204p;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lij {

    /* JADX INFO: renamed from: a */
    public final kij f133803a;

    public lij(kij kijVar) {
        this.f133803a = kijVar;
    }

    /* JADX INFO: renamed from: a */
    public static ClipData m59096a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    /* JADX INFO: renamed from: b */
    public final Pair m59097b(xfq0 xfq0Var) {
        iij t1jVar;
        iij t1jVar2;
        kij kijVar = this.f133803a;
        ClipData clipDataMo53453e = kijVar.mo53453e();
        if (clipDataMo53453e.getItemCount() == 1) {
            boolean zMo28208a = xfq0Var.mo28208a(clipDataMo53453e.getItemAt(0));
            return Pair.create(zMo28208a ? this : null, zMo28208a ? null : this);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipDataMo53453e.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo53453e.getItemAt(i);
            if (xfq0Var.mo28208a(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        Pair pairCreate = arrayList == null ? Pair.create(null, clipDataMo53453e) : arrayList2 == null ? Pair.create(clipDataMo53453e, null) : Pair.create(m59096a(clipDataMo53453e.getDescription(), arrayList), m59096a(clipDataMo53453e.getDescription(), arrayList2));
        if (pairCreate.first == null) {
            return Pair.create(null, this);
        }
        if (pairCreate.second == null) {
            return Pair.create(this, null);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            t1jVar = new t1j(this);
        } else {
            jij jijVar = new jij();
            jijVar.f112766b = kijVar.mo53453e();
            jijVar.f112767c = kijVar.getSource();
            jijVar.f112768d = kijVar.getFlags();
            jijVar.f112769e = kijVar.mo53452b();
            jijVar.f112770f = kijVar.getExtras();
            t1jVar = jijVar;
        }
        t1jVar.mo50733d((ClipData) pairCreate.first);
        lij lijVarBuild = t1jVar.build();
        if (i2 >= 31) {
            t1jVar2 = new t1j(this);
        } else {
            jij jijVar2 = new jij();
            jijVar2.f112766b = kijVar.mo53453e();
            jijVar2.f112767c = kijVar.getSource();
            jijVar2.f112768d = kijVar.getFlags();
            jijVar2.f112769e = kijVar.mo53452b();
            jijVar2.f112770f = kijVar.getExtras();
            t1jVar2 = jijVar2;
        }
        t1jVar2.mo50733d((ClipData) pairCreate.second);
        return Pair.create(lijVarBuild, t1jVar2.build());
    }

    /* JADX INFO: renamed from: c */
    public final ContentInfo m59098c() {
        ContentInfo contentInfoMo53451a = this.f133803a.mo53451a();
        Objects.requireNonNull(contentInfoMo53451a);
        return contentInfoMo53451a;
    }

    public final String toString() {
        return this.f133803a.toString();
    }
}

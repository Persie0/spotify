package p204p;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class jij implements iij, kij {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112765a = 0;

    /* JADX INFO: renamed from: b */
    public ClipData f112766b;

    /* JADX INFO: renamed from: c */
    public int f112767c;

    /* JADX INFO: renamed from: d */
    public int f112768d;

    /* JADX INFO: renamed from: e */
    public Uri f112769e;

    /* JADX INFO: renamed from: f */
    public Bundle f112770f;

    public /* synthetic */ jij() {
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: a */
    public ContentInfo mo53451a() {
        return null;
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: b */
    public Uri mo53452b() {
        return this.f112769e;
    }

    @Override // p204p.iij
    public lij build() {
        return new lij(new jij(this));
    }

    @Override // p204p.iij
    /* JADX INFO: renamed from: c */
    public void mo50732c(Uri uri) {
        this.f112769e = uri;
    }

    @Override // p204p.iij
    /* JADX INFO: renamed from: d */
    public void mo50733d(ClipData clipData) {
        this.f112766b = clipData;
    }

    @Override // p204p.kij
    /* JADX INFO: renamed from: e */
    public ClipData mo53453e() {
        return this.f112766b;
    }

    @Override // p204p.kij
    public Bundle getExtras() {
        return this.f112770f;
    }

    @Override // p204p.kij
    public int getFlags() {
        return this.f112768d;
    }

    @Override // p204p.kij
    public int getSource() {
        return this.f112767c;
    }

    @Override // p204p.iij
    public void setExtras(Bundle bundle) {
        this.f112770f = bundle;
    }

    @Override // p204p.iij
    public void setFlags(int i) {
        this.f112768d = i;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f112765a) {
            case 1:
                Uri uri = this.f112769e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f112766b.getDescription());
                sb.append(", source=");
                int i = this.f112767c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f112768d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return dq60.m36616p(this.f112770f != null ? ", hasExtras" : "", "}", sb);
            default:
                return super.toString();
        }
    }

    public jij(jij jijVar) {
        ClipData clipData = jijVar.f112766b;
        clipData.getClass();
        this.f112766b = clipData;
        int i = jijVar.f112767c;
        wj50.m88277n(i, 0, 5, "source");
        this.f112767c = i;
        int i2 = jijVar.f112768d;
        if ((i2 & 1) == i2) {
            this.f112768d = i2;
            this.f112769e = jijVar.f112769e;
            this.f112770f = jijVar.f112770f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}

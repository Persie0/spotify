package p204p;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class yy7 implements ro0 {

    /* JADX INFO: renamed from: a */
    public String f277436a;

    /* JADX INFO: renamed from: b */
    public String f277437b;

    /* JADX INFO: renamed from: c */
    public String f277438c;

    /* JADX INFO: renamed from: a */
    public zy7 m94866a() {
        String str;
        String str2;
        String str3 = this.f277436a;
        if (str3 != null && (str = this.f277437b) != null && (str2 = this.f277438c) != null) {
            return new zy7(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f277436a == null) {
            sb.append(" arch");
        }
        if (this.f277437b == null) {
            sb.append(" libraryName");
        }
        if (this.f277438c == null) {
            sb.append(" buildId");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public vi8 m94867b() {
        String str = this.f277436a;
        String str2 = this.f277437b;
        if (str2 != null) {
            return new vi8(str, str2, this.f277438c);
        }
        throw new IllegalStateException("spotifyLink was not set!");
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: c */
    public String mo29280c() {
        return this.f277437b;
    }

    /* JADX INFO: renamed from: d */
    public void m94868d(String str) {
        if (str == null) {
            throw new NullPointerException("Null arch");
        }
        this.f277436a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m94869e(String str) {
        if (str == null) {
            throw new NullPointerException("Null buildId");
        }
        this.f277438c = str;
    }

    /* JADX INFO: renamed from: f */
    public void m94870f(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f277437b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m94871i(Intent intent) {
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k != null) {
            this.f277437b = strM68854k;
            return;
        }
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        this.f277437b = dataString;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: j */
    public String mo29283j() {
        return this.f277436a;
    }

    @Override // p204p.ro0
    /* JADX INFO: renamed from: l */
    public String mo29285l() {
        return this.f277438c;
    }

    /* JADX INFO: renamed from: m */
    public void m94872m(String str) {
        this.f277438c = str;
    }

    /* JADX INFO: renamed from: n */
    public void m94873n(String str) {
        this.f277436a = str;
    }
}

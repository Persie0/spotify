package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: p.gd */
/* JADX INFO: loaded from: classes.dex */
public final class C1893gd implements Parcelable {

    /* JADX INFO: renamed from: X */
    public final String f78681X;

    /* JADX INFO: renamed from: a */
    public final Date f78682a;

    /* JADX INFO: renamed from: b */
    public final Set f78683b;

    /* JADX INFO: renamed from: c */
    public final Set f78684c;

    /* JADX INFO: renamed from: d */
    public final Set f78685d;

    /* JADX INFO: renamed from: e */
    public final String f78686e;

    /* JADX INFO: renamed from: f */
    public final EnumC2568xd f78687f;

    /* JADX INFO: renamed from: g */
    public final Date f78688g;

    /* JADX INFO: renamed from: h */
    public final String f78689h;

    /* JADX INFO: renamed from: i */
    public final String f78690i;

    /* JADX INFO: renamed from: t */
    public final Date f78691t;

    /* JADX INFO: renamed from: Y */
    public static final Date f78679Y = new Date(Long.MAX_VALUE);

    /* JADX INFO: renamed from: Z */
    public static final Date f78680Z = new Date();

    /* JADX INFO: renamed from: L0 */
    public static final EnumC2568xd f78678L0 = EnumC2568xd.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<C1893gd> CREATOR = new C2047kc(3);

    public /* synthetic */ C1893gd(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2568xd enumC2568xd, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, enumC2568xd, date, date2, date3, "facebook");
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m44324c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f78686e);
        jSONObject.put("expires_at", this.f78682a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f78683b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f78684c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f78685d));
        jSONObject.put("last_refresh", this.f78688g.getTime());
        jSONObject.put("source", this.f78687f.name());
        jSONObject.put("application_id", this.f78689h);
        jSONObject.put("user_id", this.f78690i);
        jSONObject.put("data_access_expiration_time", this.f78691t.getTime());
        String str = this.f78681X;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zM88271j;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893gd)) {
            return false;
        }
        C1893gd c1893gd = (C1893gd) obj;
        String str = c1893gd.f78681X;
        if (wj50.m88271j(this.f78682a, c1893gd.f78682a) && wj50.m88271j(this.f78683b, c1893gd.f78683b) && wj50.m88271j(this.f78684c, c1893gd.f78684c) && wj50.m88271j(this.f78685d, c1893gd.f78685d) && wj50.m88271j(this.f78686e, c1893gd.f78686e) && this.f78687f == c1893gd.f78687f && wj50.m88271j(this.f78688g, c1893gd.f78688g) && wj50.m88271j(this.f78689h, c1893gd.f78689h) && wj50.m88271j(this.f78690i, c1893gd.f78690i) && wj50.m88271j(this.f78691t, c1893gd.f78691t)) {
            String str2 = this.f78681X;
            if (str2 == null) {
                zM88271j = str == null;
            } else {
                zM88271j = wj50.m88271j(str2, str);
            }
            if (zM88271j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f78691t.hashCode() + s571.m77243b(s571.m77243b((this.f78688g.hashCode() + ((this.f78687f.hashCode() + s571.m77243b(klh.m56830b(klh.m56830b(klh.m56830b((this.f78682a.hashCode() + 527) * 31, 31, this.f78683b), 31, this.f78684c), 31, this.f78685d), 31, this.f78686e)) * 31)) * 31, 31, this.f78689h), 31, this.f78690i)) * 31;
        String str = this.f78681X;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (p8y.f175081b) {
        }
        sb.append(TextUtils.join(", ", this.f78683b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f78682a.getTime());
        parcel.writeStringList(new ArrayList(this.f78683b));
        parcel.writeStringList(new ArrayList(this.f78684c));
        parcel.writeStringList(new ArrayList(this.f78685d));
        parcel.writeString(this.f78686e);
        parcel.writeString(this.f78687f.name());
        parcel.writeLong(this.f78688g.getTime());
        parcel.writeString(this.f78689h);
        parcel.writeString(this.f78690i);
        parcel.writeLong(this.f78691t.getTime());
        parcel.writeString(this.f78681X);
    }

    public C1893gd(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, EnumC2568xd enumC2568xd, Date date, Date date2, Date date3, String str4) {
        zn91.m96544c0(str, "accessToken");
        zn91.m96544c0(str2, "applicationId");
        zn91.m96544c0(str3, "userId");
        Date date4 = f78679Y;
        this.f78682a = date == null ? date4 : date;
        this.f78683b = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f78684c = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f78685d = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.f78686e = str;
        enumC2568xd = enumC2568xd == null ? f78678L0 : enumC2568xd;
        if (str4 != null && str4.equals("instagram")) {
            int iOrdinal = enumC2568xd.ordinal();
            if (iOrdinal == 1) {
                enumC2568xd = EnumC2568xd.INSTAGRAM_APPLICATION_WEB;
            } else if (iOrdinal == 4) {
                enumC2568xd = EnumC2568xd.INSTAGRAM_WEB_VIEW;
            } else if (iOrdinal == 5) {
                enumC2568xd = EnumC2568xd.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f78687f = enumC2568xd;
        this.f78688g = date2 == null ? f78680Z : date2;
        this.f78689h = str2;
        this.f78690i = str3;
        this.f78691t = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f78681X = str4 == null ? "facebook" : str4;
    }

    public C1893gd(Parcel parcel) {
        EnumC2568xd enumC2568xdValueOf;
        this.f78682a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f78683b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f78684c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f78685d = Collections.unmodifiableSet(new HashSet(arrayList));
        String string = parcel.readString();
        zn91.m96548e0(string, "token");
        this.f78686e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            enumC2568xdValueOf = EnumC2568xd.valueOf(string2);
        } else {
            enumC2568xdValueOf = f78678L0;
        }
        this.f78687f = enumC2568xdValueOf;
        this.f78688g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        zn91.m96548e0(string3, "applicationId");
        this.f78689h = string3;
        String string4 = parcel.readString();
        zn91.m96548e0(string4, "userId");
        this.f78690i = string4;
        this.f78691t = new Date(parcel.readLong());
        this.f78681X = parcel.readString();
    }
}

package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mjd {

    /* JADX INFO: renamed from: a */
    public static final Set f144234a = bk5.m29624m1(new String[]{"party", "party-dev", "party-staging"});

    /* JADX INFO: renamed from: a */
    public static final void m61965a(z9j0 z9j0Var, String str, d850 d850Var, Bundle bundle) {
        Bundle bundleM70529j;
        Bundle bundleM70529j2;
        if (d850Var != null) {
            if (bundle != null) {
                bundle.putBoolean("campfire_navigation", true);
                bundleM70529j2 = bundle;
            } else {
                bundleM70529j2 = pp91.m70529j(new pqm0("campfire_navigation", Boolean.TRUE));
            }
            z9j0Var.mo47342b(str, d850Var, bundleM70529j2);
            return;
        }
        if (str == null) {
            throw new IllegalStateException("uri was not set!");
        }
        p6j0 p6j0Var = new p6j0(str, "", false, false, 0, 0, false, null, null, null);
        if (bundle != null) {
            bundle.putBoolean("campfire_navigation", true);
            bundleM70529j = bundle;
        } else {
            bundleM70529j = pp91.m70529j(new pqm0("campfire_navigation", Boolean.TRUE));
        }
        z9j0Var.mo47348i(p6j0Var, bundleM70529j);
    }

    /* JADX INFO: renamed from: b */
    public static final String m61966b(dd41 dd41Var) {
        List<String> pathSegments;
        switch (dd41Var.f47709c.ordinal()) {
            case 133:
            case 139:
            case 144:
            case 147:
            case 148:
            case 149:
            case 151:
            case 152:
            case 153:
            case 155:
            case 156:
                return dd41Var.m35712j();
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 141:
            case 142:
            case 143:
            case 146:
            case 150:
            case 154:
            default:
                return null;
            case 140:
            case 145:
                Uri uri = dd41Var.f47707a;
                if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
                    return null;
                }
                return pathSegments.get(1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m61967c(String str, String str2, String str3) {
        Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath("spotify:chat:".concat(str));
        if (str2 != null) {
            builderEncodedPath.appendQueryParameter("originalContentUri", str2);
        }
        if (str3 != null) {
            builderEncodedPath.appendQueryParameter("contributionId", str3);
        }
        return builderEncodedPath.build().toString();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m61968d(int i, String str, String str2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return m61967c(str, null, str2);
    }

    /* JADX INFO: renamed from: e */
    public static final String m61969e(dd41 dd41Var) {
        return "spotify:chat-share-create-group:" + ((Object) Uri.encode(dd41Var.m35698E()));
    }

    /* JADX INFO: renamed from: f */
    public static final String m61970f(dd41 dd41Var) {
        return "spotify:chat-share:" + ((Object) Uri.encode(dd41Var.m35698E()));
    }

    /* JADX INFO: renamed from: g */
    public static final String m61971g(String str) {
        return edb.m38564m("spotify:create-chat:", Uri.encode(str));
    }

    /* JADX INFO: renamed from: h */
    public static final String m61972h(dd41 dd41Var) {
        if (dd41Var.f47709c != gn80.PROFILE) {
            return null;
        }
        Uri uri = dd41Var.f47707a;
        String query = uri != null ? uri.getQuery() : null;
        Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath(dd41Var.m35694A());
        if (query != null) {
            builderEncodedPath.encodedQuery(query);
        }
        builderEncodedPath.appendQueryParameter("new_message_invite", "true");
        return builderEncodedPath.build().toString();
    }

    /* JADX INFO: renamed from: i */
    public static final String m61973i(String str) {
        return edb.m38564m("spotify:chat-interceptor:", Uri.encode(str));
    }

    /* JADX INFO: renamed from: j */
    public static final String m61974j(String str) {
        return edb.m38564m("spotify:user:", Uri.encode(str));
    }

    /* JADX INFO: renamed from: k */
    public static final String m61975k(String str, List list, String str2) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("At least two usernames are required to create a group chat");
        }
        if (str == null || wl51.m88460J0(str) || str2 == null || wl51.m88460J0(str2)) {
            Uri.Builder builderEncodedPath = new Uri.Builder().encodedPath("spotify:create-group-chat");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builderEncodedPath.appendQueryParameter("username", (String) it.next());
            }
            String string = builderEncodedPath.build().toString();
            wj50.m88279p(string);
            return string;
        }
        Uri.Builder builderEncodedPath2 = new Uri.Builder().encodedPath("spotify:chat:".concat(str));
        builderEncodedPath2.appendQueryParameter("createGroupChatToken", str2);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            builderEncodedPath2.appendQueryParameter("username", (String) it2.next());
        }
        String string2 = builderEncodedPath2.build().toString();
        wj50.m88279p(string2);
        return string2;
    }

    /* JADX INFO: renamed from: l */
    public static final String m61976l(String str) {
        return s571.m77251j("spotify:chat:", str, ":edit");
    }

    /* JADX INFO: renamed from: m */
    public static final List m61977m(dd41 dd41Var) {
        int iOrdinal = dd41Var.f47709c.ordinal();
        if (iOrdinal != 133) {
            if (iOrdinal == 137) {
                return Collections.singletonList(dd41Var.m35712j());
            }
            if (iOrdinal != 138) {
                return null;
            }
        }
        Uri uri = dd41Var.f47707a;
        if (uri != null) {
            return uri.getQueryParameters("username");
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m61978n(dd41 dd41Var) {
        Uri uri = dd41Var.f47707a;
        return wj50.m88271j(uri != null ? uri.getQueryParameter("feature") : null, "campfire_invite");
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m61979o(dd41 dd41Var) {
        if (!(dd41Var.f47710d instanceof dya1) && dd41Var.f47709c != gn80.PROFILE) {
            return false;
        }
        Uri uri = dd41Var.f47707a;
        return wj50.m88271j(uri != null ? uri.getQueryParameter("new_message_invite") : null, "true");
    }
}

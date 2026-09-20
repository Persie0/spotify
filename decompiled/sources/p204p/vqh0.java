package p204p;

import com.spotify.checkout.proto.model.p044v1.proto.C0491h0;
import com.spotify.checkout.proto.model.p044v1.proto.C0506m0;
import com.spotify.checkout.proto.model.p044v1.proto.C0507m1;
import com.spotify.checkout.proto.model.p044v1.proto.C0509n0;
import com.spotify.checkout.proto.model.p044v1.proto.C0510n1;
import com.spotify.checkout.proto.model.p044v1.proto.C0511o;
import com.spotify.checkout.proto.model.p044v1.proto.C0512o0;
import com.spotify.checkout.proto.model.p044v1.proto.C0517q;
import com.spotify.checkout.proto.model.p044v1.proto.C0525t;
import com.spotify.checkout.proto.model.p044v1.proto.C0527u;
import com.spotify.checkout.proto.model.p044v1.proto.C0533x;
import com.spotify.checkout.proto.model.p044v1.proto.Face;
import com.spotify.checkout.proto.model.p044v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.p044v1.proto.Image;
import com.spotify.checkout.proto.model.p044v1.proto.LineItem;
import com.spotify.checkout.proto.model.p044v1.proto.Timeline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class vqh0 {
    /* JADX INFO: renamed from: a */
    public static Image m86249a(String str) {
        v240 v240VarM6222r = Image.m6222r();
        v240VarM6222r.m84507q(str);
        v240VarM6222r.m84506m(str);
        return (Image) v240VarM6222r.build();
    }

    /* JADX INFO: renamed from: b */
    public static sqh0 m86250b(int i, int i2, mqh0 mqh0Var, int i3) {
        vir0 vir0Var = (i3 & 2) != 0 ? new vir0(Collections.singletonList(new pt51("premium_individual_se", new jtk0("recurring-p1m-1", null), null)), null, null) : null;
        List listM46715L = h6f.m46715L("This is one warning", "And a second one to talk about the price difference when selecting Google for example");
        boolean z = (i3 & 16) != 0;
        int i4 = (i3 & 32) != 0 ? 1 : i;
        int i5 = (i3 & 64) != 0 ? 1 : i2;
        oqh0 oqh0Var = mqh0Var;
        if ((i3 & 256) != 0) {
            oqh0Var = nqh0.f157279a;
        }
        return new sqh0(new qqh0(vir0Var, listM46715L, z, i4, i5, true, oqh0Var));
    }

    /* JADX INFO: renamed from: c */
    public static GetCheckoutPageResponse.GpbCheckout m86251c(wir0 wir0Var) {
        C0511o c0511oM6074x = GetCheckoutPageResponse.GpbCheckout.m6074x();
        c0511oM6074x.m6634r();
        if (wir0Var instanceof tir0) {
            C0517q c0517qM6085q = GetCheckoutPageResponse.GpbCheckout.GpbOtp.m6085q();
            c0517qM6085q.m6642m(((tir0) wir0Var).f220736c);
            c0511oM6074x.m6632m((GetCheckoutPageResponse.GpbCheckout.GpbOtp) c0517qM6085q.build());
        } else if (wir0Var instanceof vir0) {
            C0525t c0525tM6090w = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.m6090w();
            vir0 vir0Var = (vir0) wir0Var;
            String str = vir0Var.f241779d;
            List<pt51> list = vir0Var.f241778c;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (pt51 pt51Var : list) {
                C0533x c0533xM6112t = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers.m6112t();
                c0533xM6112t.m6682r(pt51Var.f181048a);
                jtk0 jtk0Var = pt51Var.f181049b;
                if (jtk0Var != null) {
                    c0533xM6112t.m6680m(jtk0Var.f115918a);
                    String str2 = jtk0Var.f115919b;
                    if (str2 != null) {
                        c0533xM6112t.m6681q(str2);
                    }
                }
                arrayList.add((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbIdentifiers) c0533xM6112t.build());
            }
            c0525tM6090w.m6654m(arrayList);
            if (str != null) {
                C0527u c0527uM6100s = GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSub.m6100s();
                c0527uM6100s.m6660m(str);
                tmw0 tmw0Var = vir0Var.f241780e;
                wj50.m88279p(tmw0Var);
                c0527uM6100s.m6661q(tmw0Var.f221792a);
                c0525tM6090w.m6655q((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions.GpbChangeSub) c0527uM6100s.build());
            }
            c0511oM6074x.m6633q((GetCheckoutPageResponse.GpbCheckout.GpbSubscriptions) c0525tM6090w.build());
        }
        return (GetCheckoutPageResponse.GpbCheckout) c0511oM6074x.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static LineItem m86252d(int i, int i2, boolean z) {
        String str;
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z2 = (i2 & 2) == 0;
        boolean z3 = (i2 & 4) == 0;
        if ((i2 & 8) != 0) {
            i = 1;
        }
        C0491h0 c0491h0M6227t = LineItem.m6227t();
        C0506m0 c0506m0M6263A = LineItem.SimpleLineItem.m6263A();
        C0509n0 c0509n0M6283y = LineItem.SimpleLineItem.Header.m6283y();
        v240 v240VarM6222r = Image.m6222r();
        v240VarM6222r.m84507q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        v240VarM6222r.m84506m("some alt");
        c0509n0M6283y.m6625m((Image) v240VarM6222r.build());
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            if (iM38547C == 1) {
                f6y f6yVarM6038t = Face.m6038t();
                f6yVarM6038t.m40894r("https://vignette.wikia.nocookie.net/dragons/images/4/42/Smaug.jpg");
                f6yVarM6038t.m40895s();
                f6yVarM6038t.m40893q();
                f6yVarM6038t.m40892m();
                c0509n0M6283y.m6627r((Face) f6yVarM6038t.build());
            } else if (iM38547C == 2) {
                f6y f6yVarM6038t2 = Face.m6038t();
                f6yVarM6038t2.m40894r("https://oops.i.dont.exist/image.jpg");
                f6yVarM6038t2.m40895s();
                f6yVarM6038t2.m40893q();
                f6yVarM6038t2.m40892m();
                c0509n0M6283y.m6627r((Face) f6yVarM6038t2.build());
            } else if (iM38547C == 3) {
                f6y f6yVarM6038t3 = Face.m6038t();
                f6yVarM6038t3.m40895s();
                f6yVarM6038t3.m40893q();
                f6yVarM6038t3.m40892m();
                c0509n0M6283y.m6627r((Face) f6yVarM6038t3.build());
            } else {
                if (iM38547C != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                c0509n0M6283y.m6627r((Face) Face.m6038t().build());
            }
        }
        c0509n0M6283y.m6629t("Premium Individual title that is very long and will take multiple lines");
        c0509n0M6283y.m6628s("1 Premium account that will hopefully also take two lines");
        C0512o0 c0512o0M6293u = LineItem.SimpleLineItem.Header.Price.m6293u();
        c0512o0M6293u.m6636q();
        if (z) {
            c0512o0M6293u.m6635m();
        }
        c0512o0M6293u.m6637r();
        c0509n0M6283y.m6626q((LineItem.SimpleLineItem.Header.Price) c0512o0M6293u.build());
        c0506m0M6263A.m6612r((LineItem.SimpleLineItem.Header) c0509n0M6283y.build());
        int iM38547C2 = edb.m38547C(i);
        if (iM38547C2 == 0) {
            str = null;
        } else if (iM38547C2 == 1 || iM38547C2 == 2 || iM38547C2 == 3) {
            str = "Premium is purchased for <b>gpbtest_smaug</b>";
        } else {
            if (iM38547C2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "One of your plan members will receive this subscription";
        }
        c0506m0M6263A.m6610m(bk5.m29582E0(new String[]{"Monthly billing starting today", str, "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        if (z3) {
            C0507m1 c0507m1M6484p = Timeline.m6484p();
            C0510n1 c0510n1M6487q = Timeline.TimelineItem.m6487q();
            c0510n1M6487q.m6631q(true);
            c0510n1M6487q.m6630m("<b>Today:</b> 1 month for $3.00");
            C0510n1 c0510n1M6487q2 = Timeline.TimelineItem.m6487q();
            c0510n1M6487q2.m6631q(false);
            c0510n1M6487q2.m6630m("<b>DD/MM/YY:</b> 1 month for $3.00");
            C0510n1 c0510n1M6487q3 = Timeline.TimelineItem.m6487q();
            c0510n1M6487q3.m6631q(false);
            c0510n1M6487q3.m6630m("<b>Starting DD/MM/YY:</b> $9.99/month");
            c0507m1M6484p.m6616m(h6f.m46715L(c0510n1M6487q.build(), c0510n1M6487q2.build(), c0510n1M6487q3.build()));
            c0506m0M6263A.m6615u((Timeline) c0507m1M6484p.build());
        }
        if (z2) {
            c0506m0M6263A.m6613s();
        }
        c0491h0M6227t.m6573q((LineItem.SimpleLineItem) c0506m0M6263A.build());
        return (LineItem) c0491h0M6227t.build();
    }
}

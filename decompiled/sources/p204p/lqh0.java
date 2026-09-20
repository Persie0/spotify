package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.checkout.proto.model.p044v1.proto.C0469a;
import com.spotify.checkout.proto.model.p044v1.proto.C0472b;
import com.spotify.checkout.proto.model.p044v1.proto.C0474b1;
import com.spotify.checkout.proto.model.p044v1.proto.C0475c;
import com.spotify.checkout.proto.model.p044v1.proto.C0478d;
import com.spotify.checkout.proto.model.p044v1.proto.C0481e;
import com.spotify.checkout.proto.model.p044v1.proto.C0484f;
import com.spotify.checkout.proto.model.p044v1.proto.C0486f1;
import com.spotify.checkout.proto.model.p044v1.proto.C0487g;
import com.spotify.checkout.proto.model.p044v1.proto.C0489g1;
import com.spotify.checkout.proto.model.p044v1.proto.C0490h;
import com.spotify.checkout.proto.model.p044v1.proto.C0491h0;
import com.spotify.checkout.proto.model.p044v1.proto.C0492h1;
import com.spotify.checkout.proto.model.p044v1.proto.C0493i;
import com.spotify.checkout.proto.model.p044v1.proto.C0494i0;
import com.spotify.checkout.proto.model.p044v1.proto.C0496j;
import com.spotify.checkout.proto.model.p044v1.proto.C0497j0;
import com.spotify.checkout.proto.model.p044v1.proto.C0499k;
import com.spotify.checkout.proto.model.p044v1.proto.C0500k0;
import com.spotify.checkout.proto.model.p044v1.proto.C0503l0;
import com.spotify.checkout.proto.model.p044v1.proto.C0505m;
import com.spotify.checkout.proto.model.p044v1.proto.C0506m0;
import com.spotify.checkout.proto.model.p044v1.proto.C0507m1;
import com.spotify.checkout.proto.model.p044v1.proto.C0509n0;
import com.spotify.checkout.proto.model.p044v1.proto.C0510n1;
import com.spotify.checkout.proto.model.p044v1.proto.C0512o0;
import com.spotify.checkout.proto.model.p044v1.proto.C0513o1;
import com.spotify.checkout.proto.model.p044v1.proto.C0516p1;
import com.spotify.checkout.proto.model.p044v1.proto.C0519q1;
import com.spotify.checkout.proto.model.p044v1.proto.C0521r0;
import com.spotify.checkout.proto.model.p044v1.proto.C0522r1;
import com.spotify.checkout.proto.model.p044v1.proto.C0524s0;
import com.spotify.checkout.proto.model.p044v1.proto.C0526t0;
import com.spotify.checkout.proto.model.p044v1.proto.C0530v0;
import com.spotify.checkout.proto.model.p044v1.proto.C0532w0;
import com.spotify.checkout.proto.model.p044v1.proto.C0534x0;
import com.spotify.checkout.proto.model.p044v1.proto.C0538z0;
import com.spotify.checkout.proto.model.p044v1.proto.ChangeCountry;
import com.spotify.checkout.proto.model.p044v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.p044v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.p044v1.proto.EnumC0471a1;
import com.spotify.checkout.proto.model.p044v1.proto.EnumC0515p0;
import com.spotify.checkout.proto.model.p044v1.proto.EnumC0518q0;
import com.spotify.checkout.proto.model.p044v1.proto.Error;
import com.spotify.checkout.proto.model.p044v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.p044v1.proto.Image;
import com.spotify.checkout.proto.model.p044v1.proto.LineItem;
import com.spotify.checkout.proto.model.p044v1.proto.ProductBreakdown;
import com.spotify.checkout.proto.model.p044v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.p044v1.proto.Timeline;
import com.spotify.checkout.proto.model.p044v1.proto.TimelineV2;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class lqh0 {

    /* JADX INFO: renamed from: a */
    public static final lqh0 f136051a = new lqh0();

    /* JADX INFO: renamed from: b */
    public static final fv31 f136052b = fv31.f73628b.m78183U("spotify_checkout_mock_endpoint_response");

    /* JADX INFO: renamed from: c */
    public static final LineItem f136053c;

    /* JADX INFO: renamed from: d */
    public static final TimelineV2 f136054d;

    /* JADX INFO: renamed from: e */
    public static final TimelineV2 f136055e;

    /* JADX INFO: renamed from: f */
    public static final TimelineV2 f136056f;

    /* JADX INFO: renamed from: g */
    public static final ChangeCountry f136057g;

    /* JADX INFO: renamed from: h */
    public static final FollowLinkCta f136058h;

    /* JADX INFO: renamed from: i */
    public static final GetSpotifyCheckoutPageResponse f136059i;

    /* JADX INFO: renamed from: j */
    public static final C0496j f136060j;

    /* JADX INFO: renamed from: k */
    public static final CheckoutItemUnavailable f136061k;

    /* JADX INFO: renamed from: l */
    public static final CheckoutStatus f136062l;

    /* JADX INFO: renamed from: m */
    public static final SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails f136063m;

    /* JADX INFO: renamed from: n */
    public static final List f136064n;

    /* JADX INFO: renamed from: o */
    public static final C0532w0 f136065o;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC0269h abstractC0269hBuild;
        C0491h0 c0491h0M6227t = LineItem.m6227t();
        C0506m0 c0506m0M6263A = LineItem.SimpleLineItem.m6263A();
        C0509n0 c0509n0M6283y = LineItem.SimpleLineItem.Header.m6283y();
        v240 v240VarM6222r = Image.m6222r();
        v240VarM6222r.m84507q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        v240VarM6222r.m84506m("some alt");
        c0509n0M6283y.m6625m((Image) v240VarM6222r.build());
        c0509n0M6283y.m6629t("Premium Individual title that is very long and will take multiple lines");
        c0509n0M6283y.m6628s("1 Premium account that will hopefully also take two lines");
        C0512o0 c0512o0M6293u = LineItem.SimpleLineItem.Header.Price.m6293u();
        c0512o0M6293u.m6636q();
        c0512o0M6293u.m6637r();
        c0509n0M6283y.m6626q((LineItem.SimpleLineItem.Header.Price) c0512o0M6293u.build());
        c0506m0M6263A.m6612r((LineItem.SimpleLineItem.Header) c0509n0M6283y.build());
        c0506m0M6263A.m6610m(bk5.m29582E0(new String[]{"Monthly billing starting today", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        c0491h0M6227t.m6573q((LineItem.SimpleLineItem) c0506m0M6263A.build());
        f136053c = (LineItem) c0491h0M6227t.build();
        C0513o1 c0513o1M6491r = TimelineV2.m6491r();
        C0516p1 c0516p1M6497r = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r.m6641r("Now: <strong>$0</strong>");
        C0519q1 c0519q1M6502s = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s.m6645r("Premium individual");
        C0522r1 c0522r1M6507q = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q.m6651q("Audiobooks+");
        c0519q1M6502s.m6643m(Collections.singletonList(c0522r1M6507q.build()));
        c0516p1M6497r.m6639m(Collections.singletonList(c0519q1M6502s.build()));
        C0516p1 c0516p1M6497r2 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r2.m6641r("Starting 01/02/2025: <strong>$19.98/month</strong>");
        C0519q1 c0519q1M6502s2 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s2.m6645r("Premium duo");
        C0522r1 c0522r1M6507q2 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q2.m6651q("Audiobooks+");
        c0519q1M6502s2.m6643m(Collections.singletonList(c0522r1M6507q2.build()));
        c0516p1M6497r2.m6639m(Collections.singletonList(c0519q1M6502s2.build()));
        c0513o1M6491r.m6638m(h6f.m46715L(c0516p1M6497r.build(), c0516p1M6497r2.build()));
        f136054d = (TimelineV2) c0513o1M6491r.build();
        C0513o1 c0513o1M6491r2 = TimelineV2.m6491r();
        C0516p1 c0516p1M6497r3 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r3.m6641r("<strong>Now: $0</strong>");
        C0519q1 c0519q1M6502s3 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s3.m6645r("Premium duo");
        C0522r1 c0522r1M6507q3 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q3.m6651q("Audiobooks+");
        C0522r1 c0522r1M6507q4 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q4.m6651q("Audiobooks+ for Plan Members");
        c0519q1M6502s3.m6643m(h6f.m46715L(c0522r1M6507q3.build(), c0522r1M6507q4.build()));
        c0516p1M6497r3.m6639m(Collections.singletonList(c0519q1M6502s3.build()));
        C0516p1 c0516p1M6497r4 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r4.m6641r("Starting 01/02/2025: <strong>$19.98/month</strong>");
        C0519q1 c0519q1M6502s4 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s4.m6645r("Premium Individual");
        C0522r1 c0522r1M6507q5 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q5.m6651q("Audiobooks+");
        c0519q1M6502s4.m6643m(Collections.singletonList(c0522r1M6507q5.build()));
        C0519q1 c0519q1M6502s5 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s5.m6645r("Some other stuff");
        C0522r1 c0522r1M6507q6 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q6.m6651q("Audiobooks+");
        C0522r1 c0522r1M6507q7 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q7.m6651q("More nesting");
        c0519q1M6502s5.m6643m(h6f.m46715L(c0522r1M6507q6.build(), c0522r1M6507q7.build()));
        c0516p1M6497r4.m6639m(h6f.m46715L(c0519q1M6502s4.build(), c0519q1M6502s5.build()));
        C0516p1 c0516p1M6497r5 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r5.m6641r("Starting 01/02/2025: <strong>$17.99/months</strong>");
        C0519q1 c0519q1M6502s6 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s6.m6645r("Premium family");
        C0522r1 c0522r1M6507q8 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q8.m6651q("Audiobooks+");
        C0522r1 c0522r1M6507q9 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q9.m6651q("Audiobooks+ for fam plan members+");
        c0519q1M6502s6.m6643m(h6f.m46715L(c0522r1M6507q8.build(), c0522r1M6507q9.build()));
        c0516p1M6497r5.m6639m(Collections.singletonList(c0519q1M6502s6.build()));
        c0513o1M6491r2.m6638m(h6f.m46715L(c0516p1M6497r3.build(), c0516p1M6497r4.build(), c0516p1M6497r5.build()));
        f136055e = (TimelineV2) c0513o1M6491r2.build();
        C0513o1 c0513o1M6491r3 = TimelineV2.m6491r();
        C0516p1 c0516p1M6497r6 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r6.m6641r("<strong>Now</strong>");
        c0516p1M6497r6.m6640q("$0.00");
        C0519q1 c0519q1M6502s7 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s7.m6645r("Premium individual");
        c0516p1M6497r6.m6639m(Collections.singletonList(c0519q1M6502s7.build()));
        C0516p1 c0516p1M6497r7 = TimelineV2.TimelineGroup.m6497r();
        c0516p1M6497r7.m6641r("<strong>Starting 01/02/2025</strong>");
        c0516p1M6497r7.m6640q("$19.98/month");
        C0519q1 c0519q1M6502s8 = TimelineV2.TimelineGroup.TimelineItem.m6502s();
        c0519q1M6502s8.m6645r("Premium family for 12 months but could take a couple lines");
        c0519q1M6502s8.m6644q();
        C0522r1 c0522r1M6507q10 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q10.m6651q("Product name");
        c0522r1M6507q10.m6650m();
        C0522r1 c0522r1M6507q11 = TimelineV2.TimelineGroup.TimelineItem.NestedTimelineItem.m6507q();
        c0522r1M6507q11.m6651q("2x Audiobooks+ for Plan Members");
        c0519q1M6502s8.m6643m(h6f.m46715L(c0522r1M6507q10.build(), c0522r1M6507q11.build()));
        c0516p1M6497r7.m6639m(Collections.singletonList(c0519q1M6502s8.build()));
        c0513o1M6491r3.m6638m(h6f.m46715L(c0516p1M6497r6.build(), c0516p1M6497r7.build()));
        f136056f = (TimelineV2) c0513o1M6491r3.build();
        C0469a c0469aM5945s = ChangeCountry.m5945s();
        c0469aM5945s.m6514q();
        C0472b c0472bM5953v = ChangeCountry.PickerForm.m5953v();
        C0484f c0484fM5977q = ChangeCountry.PickerForm.Cta.m5977q();
        c0484fM5977q.m6553m();
        c0472bM5953v.m6518q(c0484fM5977q);
        c0472bM5953v.m6520s();
        C0487g c0487gM5981q = ChangeCountry.PickerForm.SearchInput.m5981q();
        c0487gM5981q.m6562m();
        c0472bM5953v.m6519r(c0487gM5981q);
        Locale[] availableLocales = Locale.getAvailableLocales();
        ArrayList arrayList = new ArrayList();
        for (Locale locale : availableLocales) {
            if (!wl51.m88460J0(locale.getDisplayCountry())) {
                arrayList.add(locale);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((Locale) obj).getDisplayCountry())) {
                arrayList2.add(obj);
            }
        }
        List<Locale> listM43711Y0 = g6f.m43711Y0(arrayList2, new kxy(22));
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(listM43711Y0, 10));
        for (Locale locale2 : listM43711Y0) {
            if (wj50.m88271j(locale2.getCountry(), "FR")) {
                C0478d c0478dM5959t = ChangeCountry.PickerForm.CountryType.m5959t();
                C0475c c0475cM5967r = ChangeCountry.PickerForm.CountryType.Active.m5967r();
                c0475cM5967r.m6523m(locale2.getCountry());
                c0475cM5967r.m6524q(locale2.getDisplayCountry());
                c0478dM5959t.m6535m(c0475cM5967r);
                abstractC0269hBuild = c0478dM5959t.build();
            } else {
                C0478d c0478dM5959t2 = ChangeCountry.PickerForm.CountryType.m5959t();
                C0481e c0481eM5973s = ChangeCountry.PickerForm.CountryType.Inactive.m5973s();
                c0481eM5973s.m6550m(locale2.getCountry());
                c0481eM5973s.m6551q(locale2.getDisplayCountry());
                c0481eM5973s.m6552r("https://simplelocalize.io/data/country/" + locale2.getCountry().toUpperCase(Locale.ROOT) + "/");
                c0478dM5959t2.m6536q(c0481eM5973s);
                abstractC0269hBuild = c0478dM5959t2.build();
            }
            arrayList3.add((ChangeCountry.PickerForm.CountryType) abstractC0269hBuild);
        }
        c0472bM5953v.m6517m(arrayList3);
        c0469aM5945s.m6513m(c0472bM5953v);
        f136057g = (ChangeCountry) c0469aM5945s.build();
        pwz pwzVarM6043s = FollowLinkCta.m6043s();
        pwzVarM6043s.m71318q("Change plan");
        pwzVarM6043s.m71317m("http://fast.com");
        f136058h = (FollowLinkCta) pwzVarM6043s.build();
        nb10 nb10VarM6212y = GetSpotifyCheckoutPageResponse.m6212y();
        C0530v0 c0530v0M6326N = SpotifyCheckoutNative.m6326N();
        c0530v0M6326N.m6669t("Confirm changes to your subscription");
        C0491h0 c0491h0M6227t2 = LineItem.m6227t();
        C0506m0 c0506m0M6263A2 = LineItem.SimpleLineItem.m6263A();
        C0507m1 c0507m1M6484p = Timeline.m6484p();
        C0510n1 c0510n1M6487q = Timeline.TimelineItem.m6487q();
        c0510n1M6487q.m6631q(true);
        c0510n1M6487q.m6630m("<b>Current subscription:</b> $xx.99/month");
        C0510n1 c0510n1M6487q2 = Timeline.TimelineItem.m6487q();
        c0510n1M6487q2.m6631q(false);
        c0510n1M6487q2.m6630m("<b>Starting DD/MM/YY:</b> You’ll be charged $12.99 for Premium Family every month.");
        c0507m1M6484p.m6616m(h6f.m46715L(c0510n1M6487q.build(), c0510n1M6487q2.build()));
        c0506m0M6263A2.m6615u((Timeline) c0507m1M6484p.build());
        c0506m0M6263A2.m6610m(bk5.m29582E0(new String[]{"Canceling this add-on will change the price of your monthly subscription.", "Your subscription to [Add-on Name] will be canceled for 1 member."}));
        C0526t0 c0526t0M6302w = ProductBreakdown.m6302w();
        c0526t0M6302w.m6658r();
        c0526t0M6302w.m6659s("$17.98");
        C0524s0 c0524s0M6309s = ProductBreakdown.BreakdownGroup.m6309s();
        C0521r0 c0521r0M6317v = ProductBreakdown.BreakdownGroup.BreakdownRow.m6317v();
        c0521r0M6317v.m6647q("Premium Family");
        c0521r0M6317v.m6648r("$12.99");
        EnumC0518q0 enumC0518q0 = EnumC0518q0.DEFAULT;
        c0521r0M6317v.m6649s(enumC0518q0);
        C0521r0 c0521r0M6317v2 = ProductBreakdown.BreakdownGroup.BreakdownRow.m6317v();
        c0521r0M6317v2.m6647q("2x Some product");
        c0521r0M6317v2.m6648r("$4.99");
        c0521r0M6317v2.m6649s(enumC0518q0);
        c0524s0M6309s.m6652m(h6f.m46715L(c0521r0M6317v.build(), c0521r0M6317v2.build()));
        c0524s0M6309s.m6653q(EnumC0515p0.DEFAULT);
        C0524s0 c0524s0M6309s2 = ProductBreakdown.BreakdownGroup.m6309s();
        C0521r0 c0521r0M6317v3 = ProductBreakdown.BreakdownGroup.BreakdownRow.m6317v();
        c0521r0M6317v3.m6647q("Some product");
        c0521r0M6317v3.m6648r("- $4.99");
        c0521r0M6317v3.m6649s(EnumC0518q0.REMOVED);
        c0524s0M6309s2.m6652m(Collections.singletonList(c0521r0M6317v3.build()));
        c0524s0M6309s2.m6653q(EnumC0515p0.HIGHLIGHTED);
        c0526t0M6302w.m6656m(h6f.m46715L(c0524s0M6309s.build(), c0524s0M6309s2.build()));
        c0506m0M6263A2.m6614t((ProductBreakdown) c0526t0M6302w.build());
        c0491h0M6227t2.m6573q((LineItem.SimpleLineItem) c0506m0M6263A2.build());
        c0530v0M6326N.m6668s((LineItem) c0491h0M6227t2.build());
        c0530v0M6326N.m6672w();
        C0492h1 c0492h1M6445v = SpotifyCheckoutNative.UpdateSubscriptionCta.m6445v();
        c0492h1M6445v.m6576q("Confirm");
        C0499k c0499kM6019q = Error.CloseCta.m6019q();
        c0499kM6019q.m6599m("Not now");
        c0492h1M6445v.m6575m((Error.CloseCta) c0499kM6019q.build());
        c0530v0M6326N.m6675z((SpotifyCheckoutNative.UpdateSubscriptionCta) c0492h1M6445v.build());
        nb10VarM6212y.m64060t(c0530v0M6326N);
        f136059i = (GetSpotifyCheckoutPageResponse) nb10VarM6212y.build();
        C0496j c0496jM6011z = Error.m6011z();
        c0496jM6011z.m6591u("Error link and close");
        c0496jM6011z.m6590t("This error has a link or a close btn");
        C0505m c0505mM6030s = Error.PrimaryLinkSecondaryCloseCta.m6030s();
        pwz pwzVarM6043s2 = FollowLinkCta.m6043s();
        pwzVarM6043s2.m71318q("Watch me");
        pwzVarM6043s2.m71317m("https://www.youtube.com/watch?v=nAJN1CrJsVE");
        c0505mM6030s.m6608m(pwzVarM6043s2);
        C0499k c0499kM6019q2 = Error.CloseCta.m6019q();
        c0499kM6019q2.m6599m("close");
        c0505mM6030s.m6609q(c0499kM6019q2);
        c0496jM6011z.m6589s(c0505mM6030s);
        f136060j = c0496jM6011z;
        qzd qzdVarM5987t = CheckoutItemUnavailable.m5987t();
        qzdVarM5987t.m74330r();
        LineItem lineItem = f136053c;
        C0491h0 c0491h0 = (C0491h0) lineItem.toBuilder();
        C0506m0 c0506m0 = (C0506m0) lineItem.m6228q().toBuilder();
        c0506m0.m6613s();
        c0491h0.m6572m(c0506m0);
        qzdVarM5987t.m74329q((LineItem) c0491h0.build());
        qzdVarM5987t.m74328m();
        f136061k = (CheckoutItemUnavailable) qzdVarM5987t.build();
        C0490h c0490hM5995t = CheckoutStatus.m5995t();
        c0490hM5995t.m6571s("Wrong checkout status");
        c0490hM5995t.m6570r("Something about the status being wrong");
        C0493i c0493iM6001q = CheckoutStatus.CloseCta.m6001q();
        c0493iM6001q.m6577m("Ok then");
        c0490hM5995t.m6569q((CheckoutStatus.CloseCta) c0493iM6001q.build());
        f136062l = (CheckoutStatus) c0490hM5995t.build();
        C0534x0 c0534x0M6378y = SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails.m6378y();
        v240 v240VarM6222r2 = Image.m6222r();
        v240VarM6222r2.m84507q("https://wwwcheckout.spotifycdn.com/static/images/play-fop-logos/Visa.png");
        v240VarM6222r2.m84506m("some alt");
        c0534x0M6378y.m6683m((Image) v240VarM6222r2.build());
        c0534x0M6378y.m6685r();
        c0534x0M6378y.m6684q();
        pwz pwzVarM6043s3 = FollowLinkCta.m6043s();
        pwzVarM6043s3.m71318q("Change");
        pwzVarM6043s3.m71317m("https://www.youtube.com/watch?v=Q56PMJbCFXQ");
        c0534x0M6378y.m6686s((FollowLinkCta) pwzVarM6043s3.build());
        f136063m = (SpotifyCheckoutNative.PaymentSection.CurrentPaymentDetails) c0534x0M6378y.build();
        C0538z0 c0538z0M6391t = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        EnumC0471a1 enumC0471a1 = EnumC0471a1.CHECKBOX;
        c0538z0M6391t.m6692r(enumC0471a1);
        c0538z0M6391t.m6691q("By purchasing this product you agree to Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque a massa id sapien sollicitudin rhoncus.");
        c0538z0M6391t.m6690m("Checkbox 1 not checked");
        C0538z0 c0538z0M6391t2 = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        c0538z0M6391t2.m6692r(enumC0471a1);
        c0538z0M6391t2.m6691q("Also, by purchasing this product you massa id sapien sollicitudin");
        c0538z0M6391t2.m6690m("Checkbox 2 not checked");
        C0538z0 c0538z0M6391t3 = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        c0538z0M6391t3.m6692r(EnumC0471a1.CONSPICUOUS_CHECKBOX);
        c0538z0M6391t3.m6691q("conspicuous checkbox");
        c0538z0M6391t3.m6690m("Conspicuous checkbox not checked, <a href=\"https://support.spotify.com/\">see this link</a>");
        C0538z0 c0538z0M6391t4 = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        EnumC0471a1 enumC0471a2 = EnumC0471a1.TEXT;
        c0538z0M6391t4.m6692r(enumC0471a2);
        c0538z0M6391t4.m6691q("Text <b>legal term</b>");
        C0538z0 c0538z0M6391t5 = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        c0538z0M6391t5.m6692r(enumC0471a2);
        c0538z0M6391t5.m6691q("Another text <b>legal term</b>");
        C0538z0 c0538z0M6391t6 = SpotifyCheckoutNative.PaymentSection.LegalTerm.m6391t();
        c0538z0M6391t6.m6692r(EnumC0471a1.CONSPICUOUS_TEXT);
        c0538z0M6391t6.m6691q("<b>Subscription terms:</b> Something about the subscription");
        f136064n = h6f.m46715L(c0538z0M6391t.build(), c0538z0M6391t2.build(), c0538z0M6391t3.build(), c0538z0M6391t4.build(), c0538z0M6391t5.build(), c0538z0M6391t6.build());
        C0532w0 c0532w0M6365z = SpotifyCheckoutNative.PaymentSection.m6365z();
        c0532w0M6365z.m6679s("Payment");
        C0474b1 c0474b1M6397u = SpotifyCheckoutNative.PaymentSection.PaymentArgs.m6397u();
        c0474b1M6397u.m6522m();
        c0532w0M6365z.m6678r(c0474b1M6397u);
        f136065o = c0532w0M6365z;
    }

    /* JADX INFO: renamed from: a */
    public static final C0486f1 m59760a(TimelineV2 timelineV2) {
        C0486f1 c0486f1M6406F = SpotifyCheckoutNative.SummarySection.m6406F();
        c0486f1M6406F.m6559s();
        C0489g1 c0489g1M6436y = SpotifyCheckoutNative.SummarySection.ItemRow.m6436y();
        c0489g1M6436y.m6567t();
        v240 v240VarM6222r = Image.m6222r();
        v240VarM6222r.m84507q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
        v240VarM6222r.m84506m("some alt");
        c0489g1M6436y.m6563m(v240VarM6222r);
        c0489g1M6436y.m6566s();
        c0489g1M6436y.m6564q();
        c0489g1M6436y.m6565r();
        c0486f1M6406F.m6557q(c0489g1M6436y);
        c0486f1M6406F.m6558r(timelineV2);
        c0486f1M6406F.m6556m(bk5.m29582E0(new String[]{"First additional product info", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        c0486f1M6406F.m6560t();
        c0486f1M6406F.m6561u();
        return c0486f1M6406F;
    }

    /* JADX INFO: renamed from: b */
    public static vb41 m59761b(RetrofitMaker retrofitMaker, hv31 hv31Var) {
        uph0 uph0Var;
        try {
            uph0Var = (uph0) uph0.f232695d.get(hv31Var.mo48717l(f136052b, 0));
        } catch (Throwable unused) {
            uph0Var = uph0.f232693b;
        }
        return (vb41) uph0Var.f232696a.invoke(retrofitMaker, hv31Var);
    }

    /* JADX INFO: renamed from: c */
    public static LineItem m59762c(TimelineV2 timelineV2, boolean z) {
        C0491h0 c0491h0M6227t = LineItem.m6227t();
        C0494i0 c0494i0M6235w = LineItem.LineItemV2.m6235w();
        C0497j0 c0497j0M6246y = LineItem.LineItemV2.Header.m6246y();
        if (z) {
            v240 v240VarM6222r = Image.m6222r();
            v240VarM6222r.m84507q("https://checkout.spotifycdn.com/static/images/product-images/recurring_premium.png");
            v240VarM6222r.m84506m("some alt");
            c0497j0M6246y.m6592m((Image) v240VarM6222r.build());
        }
        c0497j0M6246y.m6595s();
        c0497j0M6246y.m6594r();
        C0500k0 c0500k0M6255q = LineItem.PriceInfo.m6255q();
        C0503l0 c0503l0M6261s = LineItem.PriceInfo.PriceInfoV1.m6261s();
        c0503l0M6261s.m6604q();
        c0503l0M6261s.m6605r();
        c0503l0M6261s.m6603m();
        c0500k0M6255q.m6600m((LineItem.PriceInfo.PriceInfoV1) c0503l0M6261s.build());
        c0497j0M6246y.m6593q((LineItem.PriceInfo) c0500k0M6255q.build());
        c0494i0M6235w.m6579q((LineItem.LineItemV2.Header) c0497j0M6246y.build());
        c0494i0M6235w.m6578m(bk5.m29582E0(new String[]{"First additional product info", "Cancel anytime online. <a href=\"https://www.spotify.com/legal/privacy-policy\">Terms apply</a>"}));
        c0494i0M6235w.m6580r(timelineV2);
        c0491h0M6227t.m6574r((LineItem.LineItemV2) c0494i0M6235w.build());
        return (LineItem) c0491h0M6227t.build();
    }

    /* JADX INFO: renamed from: d */
    public static zph0 m59763d(lqh0 lqh0Var, gh00 gh00Var) {
        lqh0Var.getClass();
        return new zph0(1000L, gh00Var);
    }

    /* JADX INFO: renamed from: e */
    public static aqh0 m59764e(lqh0 lqh0Var, RetrofitMaker retrofitMaker, gh00 gh00Var) {
        lqh0Var.getClass();
        uph0 uph0Var = uph0.f232693b;
        return new aqh0((vb41) retrofitMaker.createWebgateService(vb41.class, "android-system-checkout"), 1000L, gh00Var);
    }
}

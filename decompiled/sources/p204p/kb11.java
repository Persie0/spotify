package p204p;

import com.spotify.music.R;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kb11 {

    /* JADX INFO: renamed from: a */
    public static final Set f121032a = bk5.m29624m1(new String[]{"submit_report_adult_content", "submit_report_deceptive_misleading", "submit_report_dangerous_inappropriate", "submit_report_illegal_restricted", "submit_report_quality_technical"});

    /* JADX INFO: renamed from: a */
    public static final ry1 m55917a(String str) {
        return new ry1("not_interested_reasons", new jy1(R.string.ads_context_menu_not_interested_header), h6f.m46715L(new oy1(py1.TOO_OFTEN, R.string.ads_context_menu_reason_too_often, (wwu) null, new ly1(new iqy("negative_repetitive", str)), 12), new oy1(py1.NOT_BRAND, R.string.ads_context_menu_reason_not_brand, (wwu) null, new ly1(new iqy("negative_brand", str)), 12), new oy1(py1.NOT_PRODUCT, R.string.ads_context_menu_reason_not_product, (wwu) null, new ly1(new iqy("negative_product", str)), 12), new oy1(py1.ALREADY_USING, R.string.ads_context_menu_reason_already_using, (wwu) null, new ly1(new iqy("negative_already_using", str)), 12), new oy1(py1.SOMETHING_ELSE, R.string.ads_context_menu_reason_something_else, (wwu) null, new ly1(new iqy("negative_something_else", str)), 12)), null);
    }

    /* JADX INFO: renamed from: b */
    public static final ry1 m55918b() {
        return new ry1("report_ad_categories", new jy1(R.string.ads_context_menu_report_ad_header), h6f.m46715L(new oy1(py1.REPORT_ADULT_CONTENT, R.string.ads_report_category_adult_content, (wwu) null, new my1("submit_report_adult_content"), 4), new oy1(py1.REPORT_DECEPTIVE_MISLEADING, R.string.ads_report_category_deceptive_misleading, (wwu) null, new my1("submit_report_deceptive_misleading"), 4), new oy1(py1.REPORT_DANGEROUS_INAPPROPRIATE, R.string.ads_report_category_dangerous_inappropriate, (wwu) null, new my1("submit_report_dangerous_inappropriate"), 4), new oy1(py1.REPORT_ILLEGAL_RESTRICTED, R.string.ads_report_category_illegal_restricted, (wwu) null, new my1("submit_report_illegal_restricted"), 4), new oy1(py1.REPORT_QUALITY_TECHNICAL, R.string.ads_report_category_quality_technical, (wwu) null, new my1("submit_report_quality_technical"), 4)), new hy1());
    }

    /* JADX INFO: renamed from: c */
    public static final List m55919c(String str) {
        return h6f.m46715L(m55920d(8, R.string.ads_report_category_adult_content, str), m55920d(9, R.string.ads_report_category_deceptive_misleading, str), m55920d(10, R.string.ads_report_category_dangerous_inappropriate, str), m55920d(11, R.string.ads_report_category_illegal_restricted, str), m55920d(12, R.string.ads_report_category_quality_technical, str));
    }

    /* JADX INFO: renamed from: d */
    public static final sy1 m55920d(int i, int i2, String str) {
        return new sy1("submit_".concat(j4x.m52405c(i)), new jy1(R.string.ads_context_menu_report_ad_header), i2, new jqy(j4x.m52405c(i), str));
    }
}

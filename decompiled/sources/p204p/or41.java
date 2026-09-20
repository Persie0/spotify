package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class or41 extends jl80 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f168469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or41(int i) {
        super(1);
        this.f168469g = i;
    }

    @Override // p204p.jl80
    /* JADX INFO: renamed from: c */
    public final int[] mo45855c(AbstractC0110a abstractC0110a, View view) {
        int iM1079M;
        int iM1079M2;
        switch (this.f168469g) {
            case 0:
                if (!abstractC0110a.mo951q()) {
                    return super.mo45855c(abstractC0110a, view);
                }
                new Rect();
                if (abstractC0110a.m1106S() == 1) {
                    iM1079M = (AbstractC0110a.m1081P(view) + ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).rightMargin) - (abstractC0110a.f1288M0 - abstractC0110a.getPaddingRight());
                } else {
                    iM1079M = AbstractC0110a.m1079M(view) - ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).leftMargin;
                }
                return new int[]{iM1079M, 0};
            default:
                if (!abstractC0110a.mo951q()) {
                    return super.mo45855c(abstractC0110a, view);
                }
                new Rect();
                boolean z = abstractC0110a.m1106S() == 1;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.widgets_spacer_base);
                if (z) {
                    iM1079M2 = AbstractC0110a.m1081P(view) + ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).rightMargin;
                    dimensionPixelSize = abstractC0110a.f1288M0 - abstractC0110a.getPaddingRight();
                } else {
                    iM1079M2 = AbstractC0110a.m1079M(view) - ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).leftMargin;
                }
                return new int[]{iM1079M2 - dimensionPixelSize, 0};
        }
    }

    @Override // p204p.jl80
    /* JADX INFO: renamed from: i */
    public final View mo45856i(AbstractC0110a abstractC0110a) {
        switch (this.f168469g) {
            case 0:
                if (abstractC0110a instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0110a;
                    if (linearLayoutManager.mo951q()) {
                        new Rect();
                        boolean z = linearLayoutManager.m1106S() == 1;
                        int iM942i1 = linearLayoutManager.m1106S() == 1 ? linearLayoutManager.m942i1() : linearLayoutManager.m939g1();
                        if (iM942i1 != -1) {
                            int iM942i2 = linearLayoutManager.m1106S() == 1 ? linearLayoutManager.m942i1() : linearLayoutManager.m939g1();
                            if (linearLayoutManager.m1106S() != 1 ? iM942i2 != linearLayoutManager.m1104R() - 1 : iM942i2 != 0) {
                                View viewMo923D = linearLayoutManager.mo923D(iM942i1);
                                ojv0 ojv0Var = (ojv0) viewMo923D.getLayoutParams();
                                int iM1101O = abstractC0110a.m1101O(viewMo923D) + ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin;
                                int iM1081P = AbstractC0110a.m1081P(viewMo923D) + ((ViewGroup.MarginLayoutParams) ((ojv0) viewMo923D.getLayoutParams())).rightMargin;
                                if (z) {
                                    int paddingRight = abstractC0110a.f1288M0 - abstractC0110a.getPaddingRight();
                                    if (iM1081P <= paddingRight && paddingRight - iM1081P < iM1101O / 2) {
                                        return viewMo923D;
                                    }
                                } else if (iM1081P >= iM1101O / 2 && iM1081P > 0) {
                                    return viewMo923D;
                                }
                                int iM942i3 = linearLayoutManager.m1106S() == 1 ? linearLayoutManager.m942i1() : linearLayoutManager.m939g1();
                                if (linearLayoutManager.m1106S() != 1 ? iM942i3 != linearLayoutManager.m1104R() - 1 : iM942i3 != 0) {
                                    return linearLayoutManager.mo923D(z ? iM942i1 - 1 : iM942i1 + 1);
                                }
                            }
                        }
                        return null;
                    }
                }
                return super.mo45856i(abstractC0110a);
            default:
                if (abstractC0110a instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) abstractC0110a;
                    if (linearLayoutManager2.mo951q()) {
                        new Rect();
                        boolean z2 = linearLayoutManager2.m1106S() == 1;
                        int iM942i4 = linearLayoutManager2.m1106S() == 1 ? linearLayoutManager2.m942i1() : linearLayoutManager2.m939g1();
                        if (iM942i4 != -1) {
                            int iM942i5 = linearLayoutManager2.m1106S() == 1 ? linearLayoutManager2.m942i1() : linearLayoutManager2.m939g1();
                            if (linearLayoutManager2.m1106S() != 1 ? iM942i5 != linearLayoutManager2.m1104R() - 1 : iM942i5 != 0) {
                                View viewMo923D2 = linearLayoutManager2.mo923D(iM942i4);
                                ojv0 ojv0Var2 = (ojv0) viewMo923D2.getLayoutParams();
                                int iM1101O2 = abstractC0110a.m1101O(viewMo923D2) + ((ViewGroup.MarginLayoutParams) ojv0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) ojv0Var2).rightMargin;
                                int iM1081P2 = AbstractC0110a.m1081P(viewMo923D2) + ((ViewGroup.MarginLayoutParams) ((ojv0) viewMo923D2.getLayoutParams())).rightMargin;
                                if (z2) {
                                    int paddingRight2 = abstractC0110a.f1288M0 - abstractC0110a.getPaddingRight();
                                    if (iM1081P2 <= paddingRight2 && paddingRight2 - iM1081P2 < iM1101O2 / 2) {
                                        return viewMo923D2;
                                    }
                                } else if (iM1081P2 >= iM1101O2 / 2 && iM1081P2 > 0) {
                                    return viewMo923D2;
                                }
                                int iM942i6 = linearLayoutManager2.m1106S() == 1 ? linearLayoutManager2.m942i1() : linearLayoutManager2.m939g1();
                                if (linearLayoutManager2.m1106S() != 1 ? iM942i6 != linearLayoutManager2.m1104R() - 1 : iM942i6 != 0) {
                                    return linearLayoutManager2.mo923D(z2 ? iM942i4 - 1 : iM942i4 + 1);
                                }
                            }
                        }
                        return null;
                    }
                }
                return super.mo45856i(abstractC0110a);
        }
    }
}

package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.spotify.music.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p204p.a3z0;
import p204p.b3z0;
import p204p.c3z0;
import p204p.cpc1;
import p204p.cx21;
import p204p.d3z0;
import p204p.e3z0;
import p204p.f290;
import p204p.f3z0;
import p204p.flw0;
import p204p.g3z0;
import p204p.h3u0;
import p204p.h75;
import p204p.mec1;
import p204p.pze;
import p204p.q261;
import p204p.r3h1;
import p204p.s55;
import p204p.u8m;
import p204p.wo5;
import p204p.y28;
import p204p.z28;

/* JADX INFO: loaded from: classes3.dex */
public class SearchView extends LinearLayoutCompat implements pze {

    /* JADX INFO: renamed from: G1 */
    public static final flw0 f215G1;

    /* JADX INFO: renamed from: A1 */
    public int f216A1;

    /* JADX INFO: renamed from: B1 */
    public SearchableInfo f217B1;

    /* JADX INFO: renamed from: C1 */
    public Bundle f218C1;

    /* JADX INFO: renamed from: D1 */
    public final a3z0 f219D1;

    /* JADX INFO: renamed from: E1 */
    public final a3z0 f220E1;

    /* JADX INFO: renamed from: F1 */
    public final WeakHashMap f221F1;

    /* JADX INFO: renamed from: Q0 */
    public final SearchAutoComplete f222Q0;

    /* JADX INFO: renamed from: R0 */
    public final View f223R0;

    /* JADX INFO: renamed from: S0 */
    public final View f224S0;

    /* JADX INFO: renamed from: T0 */
    public final View f225T0;

    /* JADX INFO: renamed from: U0 */
    public final ImageView f226U0;

    /* JADX INFO: renamed from: V0 */
    public final ImageView f227V0;

    /* JADX INFO: renamed from: W0 */
    public final ImageView f228W0;

    /* JADX INFO: renamed from: X0 */
    public final ImageView f229X0;

    /* JADX INFO: renamed from: Y0 */
    public final View f230Y0;

    /* JADX INFO: renamed from: Z0 */
    public g3z0 f231Z0;

    /* JADX INFO: renamed from: a1 */
    public final Rect f232a1;

    /* JADX INFO: renamed from: b1 */
    public final Rect f233b1;

    /* JADX INFO: renamed from: c1 */
    public final int[] f234c1;

    /* JADX INFO: renamed from: d1 */
    public final int[] f235d1;

    /* JADX INFO: renamed from: e1 */
    public final ImageView f236e1;

    /* JADX INFO: renamed from: f1 */
    public final Drawable f237f1;

    /* JADX INFO: renamed from: g1 */
    public final int f238g1;

    /* JADX INFO: renamed from: h1 */
    public final int f239h1;

    /* JADX INFO: renamed from: i1 */
    public final Intent f240i1;

    /* JADX INFO: renamed from: j1 */
    public final Intent f241j1;

    /* JADX INFO: renamed from: k1 */
    public final CharSequence f242k1;

    /* JADX INFO: renamed from: l1 */
    public d3z0 f243l1;

    /* JADX INFO: renamed from: m1 */
    public View.OnFocusChangeListener f244m1;

    /* JADX INFO: renamed from: n1 */
    public View.OnClickListener f245n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f246o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f247p1;

    /* JADX INFO: renamed from: q1 */
    public u8m f248q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f249r1;

    /* JADX INFO: renamed from: s1 */
    public CharSequence f250s1;

    /* JADX INFO: renamed from: t1 */
    public boolean f251t1;

    /* JADX INFO: renamed from: u1 */
    public boolean f252u1;

    /* JADX INFO: renamed from: v1 */
    public int f253v1;

    /* JADX INFO: renamed from: w1 */
    public boolean f254w1;

    /* JADX INFO: renamed from: x1 */
    public String f255x1;

    /* JADX INFO: renamed from: y1 */
    public CharSequence f256y1;

    /* JADX INFO: renamed from: z1 */
    public boolean f257z1;

    public static class SearchAutoComplete extends s55 {

        /* JADX INFO: renamed from: e */
        public int f258e;

        /* JADX INFO: renamed from: f */
        public SearchView f259f;

        /* JADX INFO: renamed from: g */
        public boolean f260g;

        /* JADX INFO: renamed from: h */
        public final RunnableC0012d f261h;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: a */
        public final void m148a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0011c.m177b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            flw0 flw0Var = SearchView.f215G1;
            flw0Var.getClass();
            flw0.m42018t();
            Method method = (Method) flw0Var.f70880d;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f258e <= 0 || super.enoughToFilter();
        }

        @Override // p204p.s55, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f260g) {
                RunnableC0012d runnableC0012d = this.f261h;
                removeCallbacks(runnableC0012d);
                post(runnableC0012d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f259f;
            searchView.m147x(searchView.f247p1);
            searchView.post(searchView.f219D1);
            if (searchView.f222Q0.hasFocus()) {
                searchView.m136m();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f259f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f259f.hasFocus() && getVisibility() == 0) {
                this.f260g = true;
                Context context = getContext();
                flw0 flw0Var = SearchView.f215G1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m148a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0012d runnableC0012d = this.f261h;
            if (!z) {
                this.f260g = false;
                removeCallbacks(runnableC0012d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f260g = true;
                    return;
                }
                this.f260g = false;
                removeCallbacks(runnableC0012d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f259f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f258e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f261h = new RunnableC0012d(this);
            this.f258e = getThreshold();
        }
    }

    static {
        flw0 flw0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            flw0 flw0Var2 = new flw0();
            flw0Var2.f70878b = null;
            flw0Var2.f70879c = null;
            flw0Var2.f70880d = null;
            flw0.m42018t();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                flw0Var2.f70878b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                flw0Var2.f70879c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                flw0Var2.f70880d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            flw0Var = flw0Var2;
        }
        f215G1 = flw0Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f252u1 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f252u1 = false;
    }

    public int getImeOptions() {
        return this.f222Q0.getImeOptions();
    }

    public int getInputType() {
        return this.f222Q0.getInputType();
    }

    public int getMaxWidth() {
        return this.f253v1;
    }

    public CharSequence getQuery() {
        return this.f222Q0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f250s1;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f217B1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f242k1 : getContext().getText(this.f217B1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f239h1;
    }

    public int getSuggestionRowLayout() {
        return this.f238g1;
    }

    public u8m getSuggestionsAdapter() {
        return this.f248q1;
    }

    /* JADX INFO: renamed from: j */
    public final void m133j() {
        int dimensionPixelSize;
        View view = this.f230Y0;
        if (view.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f224S0.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM33562a = cpc1.m33562a(this);
            if (this.f246o1) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                dimensionPixelSize = 0;
            }
            SearchAutoComplete searchAutoComplete = this.f222Q0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(zM33562a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Intent m134k(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f256y1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f218C1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f217B1.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: l */
    public final Intent m135l(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f218C1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX INFO: renamed from: m */
    public final void m136m() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        if (i >= 29) {
            AbstractC0011c.m176a(searchAutoComplete);
            return;
        }
        flw0 flw0Var = f215G1;
        flw0Var.getClass();
        flw0.m42018t();
        Method method = (Method) flw0Var.f70878b;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        flw0Var.getClass();
        flw0.m42018t();
        Method method2 = (Method) flw0Var.f70879c;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m137n() {
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f246o1) {
            clearFocus();
            m147x(true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m138o(int i) {
        String strM71984i;
        Cursor cursor = this.f248q1.f227975c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM134k = null;
            try {
                try {
                    int i2 = q261.f184508V0;
                    String strM71984i2 = q261.m71984i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strM71984i2 == null) {
                        strM71984i2 = this.f217B1.getSuggestIntentAction();
                    }
                    if (strM71984i2 == null) {
                        strM71984i2 = "android.intent.action.SEARCH";
                    }
                    String strM71984i3 = q261.m71984i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strM71984i3 == null) {
                        strM71984i3 = this.f217B1.getSuggestIntentData();
                    }
                    if (strM71984i3 != null && (strM71984i = q261.m71984i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strM71984i3 = strM71984i3 + "/" + Uri.encode(strM71984i);
                    }
                    intentM134k = m134k(strM71984i3 == null ? null : Uri.parse(strM71984i3), strM71984i2, q261.m71984i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), q261.m71984i(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentM134k != null) {
                try {
                    getContext().startActivity(intentM134k);
                } catch (RuntimeException unused3) {
                    intentM134k.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // p204p.pze
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f256y1 = "";
        clearFocus();
        m147x(true);
        searchAutoComplete.setImeOptions(this.f216A1);
        this.f257z1 = false;
    }

    @Override // p204p.pze
    public final void onActionViewExpanded() {
        if (this.f257z1) {
            return;
        }
        this.f257z1 = true;
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f216A1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f219D1);
        post(this.f220E1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f222Q0;
            int[] iArr = this.f234c1;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f235d1;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f232a1;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f233b1;
            rect2.set(i7, 0, i8, i9);
            g3z0 g3z0Var = this.f231Z0;
            if (g3z0Var == null) {
                g3z0 g3z0Var2 = new g3z0(rect2, rect, searchAutoComplete);
                this.f231Z0 = g3z0Var2;
                setTouchDelegate(g3z0Var2);
            } else {
                g3z0Var.f76298b.set(rect2);
                Rect rect3 = g3z0Var.f76300d;
                rect3.set(rect2);
                int i10 = -g3z0Var.f76301e;
                rect3.inset(i10, i10);
                g3z0Var.f76299c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f247p1) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f253v1;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f253v1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f253v1) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f3z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f3z0 f3z0Var = (f3z0) parcelable;
        super.onRestoreInstanceState(f3z0Var.f161807a);
        m147x(f3z0Var.f65616c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f3z0 f3z0Var = new f3z0(super.onSaveInstanceState());
        f3z0Var.f65616c = this.f247p1;
        return f3z0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f219D1);
    }

    /* JADX INFO: renamed from: p */
    public final void m139p(int i) {
        Editable text = this.f222Q0.getText();
        Cursor cursor = this.f248q1.f227975c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strMo71987c = this.f248q1.mo71987c(cursor);
        if (strMo71987c != null) {
            setQuery(strMo71987c);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m140q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: r */
    public final void m141r() {
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        d3z0 d3z0Var = this.f243l1;
        if (d3z0Var != null) {
            text.toString();
            if (d3z0Var.mo31910h()) {
                return;
            }
        }
        if (this.f217B1 != null) {
            getContext().startActivity(m134k(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f252u1 || !isFocusable()) {
            return false;
        }
        if (this.f247p1) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f222Q0.requestFocus(i, rect);
        if (zRequestFocus) {
            m147x(false);
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: s */
    public final void m142s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f222Q0.getText());
        int i = (!zIsEmpty || (this.f246o1 && !this.f257z1)) ? 0 : 8;
        ImageView imageView = this.f228W0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f218C1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m137n();
            return;
        }
        m147x(false);
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f245n1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f246o1 == z) {
            return;
        }
        this.f246o1 = z;
        m147x(z);
        m144u();
    }

    public void setImeOptions(int i) {
        this.f222Q0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f222Q0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f253v1 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f244m1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(d3z0 d3z0Var) {
        this.f243l1 = d3z0Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f245n1 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f250s1 = charSequence;
        m144u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f251t1 = z;
        u8m u8mVar = this.f248q1;
        if (u8mVar instanceof q261) {
            ((q261) u8mVar).f184511N0 = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.f217B1 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f217B1.getImeOptions());
            int inputType = this.f217B1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f217B1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            u8m u8mVar = this.f248q1;
            if (u8mVar != null) {
                u8mVar.mo71986b(null);
            }
            if (this.f217B1.getSuggestAuthority() != null) {
                q261 q261Var = new q261(getContext(), this, this.f217B1, this.f221F1);
                this.f248q1 = q261Var;
                searchAutoComplete.setAdapter(q261Var);
                ((q261) this.f248q1).f184511N0 = this.f251t1 ? 2 : 1;
            }
            m144u();
        }
        SearchableInfo searchableInfo2 = this.f217B1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f217B1.getVoiceSearchLaunchWebSearch()) {
                intent = this.f240i1;
            } else if (this.f217B1.getVoiceSearchLaunchRecognizer()) {
                intent = this.f241j1;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f254w1 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m147x(this.f247p1);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f249r1 = z;
        m147x(this.f247p1);
    }

    public void setSuggestionsAdapter(u8m u8mVar) {
        this.f248q1 = u8mVar;
        this.f222Q0.setAdapter(u8mVar);
    }

    /* JADX INFO: renamed from: t */
    public final void m143t() {
        int[] iArr = this.f222Q0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f224S0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f225T0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u */
    public final void m144u() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f246o1;
        SearchAutoComplete searchAutoComplete = this.f222Q0;
        CharSequence charSequence2 = charSequence;
        if (z && (drawable = this.f237f1) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    /* JADX INFO: renamed from: v */
    public final void m145v() {
        this.f225T0.setVisibility(((this.f249r1 || this.f254w1) && !this.f247p1 && (this.f227V0.getVisibility() == 0 || this.f229X0.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: w */
    public final void m146w(boolean z) {
        boolean z2 = this.f249r1;
        this.f227V0.setVisibility((!z2 || !(z2 || this.f254w1) || this.f247p1 || !hasFocus() || (!z && this.f254w1)) ? 8 : 0);
    }

    /* JADX INFO: renamed from: x */
    public final void m147x(boolean z) {
        this.f247p1 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f222Q0.getText());
        this.f226U0.setVisibility(i2);
        m146w(!zIsEmpty);
        this.f223R0.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f236e1;
        imageView.setVisibility((imageView.getDrawable() == null || this.f246o1) ? 8 : 0);
        m142s();
        if (this.f254w1 && !this.f247p1 && zIsEmpty) {
            this.f227V0.setVisibility(8);
            i = 0;
        }
        this.f229X0.setVisibility(i);
        m145v();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f232a1 = new Rect();
        this.f233b1 = new Rect();
        this.f234c1 = new int[2];
        this.f235d1 = new int[2];
        this.f219D1 = new a3z0(this, 0);
        this.f220E1 = new a3z0(this, 1);
        this.f221F1 = new WeakHashMap();
        ViewOnClickListenerC0009a viewOnClickListenerC0009a = new ViewOnClickListenerC0009a(this);
        ViewOnKeyListenerC0010b viewOnKeyListenerC0010b = new ViewOnKeyListenerC0010b(this);
        z28 z28Var = new z28(this, 4);
        h75 h75Var = new h75(this, 3);
        f290 f290Var = new f290(this, 1);
        wo5 wo5Var = new wo5(this, 12);
        int[] iArr = h3u0.f87341u;
        cx21 cx21VarM34178J = cx21.m34178J(context, attributeSet, iArr, i);
        mec1.m61563o(this, context, iArr, attributeSet, (TypedArray) cx21VarM34178J.f42890c, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) cx21VarM34178J.f42890c;
        layoutInflaterFrom.inflate(typedArray.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f222Q0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f223R0 = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f224S0 = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f225T0 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f226U0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f227V0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f228W0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f229X0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f236e1 = imageView5;
        viewFindViewById.setBackground(cx21VarM34178J.m34202l(10));
        viewFindViewById2.setBackground(cx21VarM34178J.m34202l(14));
        imageView.setImageDrawable(cx21VarM34178J.m34202l(13));
        imageView2.setImageDrawable(cx21VarM34178J.m34202l(7));
        imageView3.setImageDrawable(cx21VarM34178J.m34202l(4));
        imageView4.setImageDrawable(cx21VarM34178J.m34202l(16));
        imageView5.setImageDrawable(cx21VarM34178J.m34202l(13));
        this.f237f1 = cx21VarM34178J.m34202l(12);
        r3h1.m74673u(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f238g1 = typedArray.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f239h1 = typedArray.getResourceId(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0009a);
        imageView3.setOnClickListener(viewOnClickListenerC0009a);
        imageView2.setOnClickListener(viewOnClickListenerC0009a);
        imageView4.setOnClickListener(viewOnClickListenerC0009a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0009a);
        searchAutoComplete.addTextChangedListener(wo5Var);
        searchAutoComplete.setOnEditorActionListener(z28Var);
        searchAutoComplete.setOnItemClickListener(h75Var);
        searchAutoComplete.setOnItemSelectedListener(f290Var);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0010b);
        searchAutoComplete.setOnFocusChangeListener(new y28(this, 12));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f242k1 = typedArray.getText(6);
        this.f250s1 = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        cx21VarM34178J.m34189K();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f240i1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f241j1 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f230Y0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new b3z0(this));
        }
        m147x(this.f246o1);
        m144u();
    }

    public void setOnCloseListener(c3z0 c3z0Var) {
    }

    public void setOnSuggestionListener(e3z0 e3z0Var) {
    }
}

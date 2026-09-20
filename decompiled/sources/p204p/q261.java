package p204p;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.spotify.music.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class q261 extends u8m implements View.OnClickListener {

    /* JADX INFO: renamed from: V0 */
    public static final /* synthetic */ int f184508V0 = 0;

    /* JADX INFO: renamed from: L0 */
    public final WeakHashMap f184509L0;

    /* JADX INFO: renamed from: M0 */
    public final int f184510M0;

    /* JADX INFO: renamed from: N0 */
    public int f184511N0;

    /* JADX INFO: renamed from: O0 */
    public ColorStateList f184512O0;

    /* JADX INFO: renamed from: P0 */
    public int f184513P0;

    /* JADX INFO: renamed from: Q0 */
    public int f184514Q0;

    /* JADX INFO: renamed from: R0 */
    public int f184515R0;

    /* JADX INFO: renamed from: S0 */
    public int f184516S0;

    /* JADX INFO: renamed from: T0 */
    public int f184517T0;

    /* JADX INFO: renamed from: U0 */
    public int f184518U0;

    /* JADX INFO: renamed from: X */
    public final SearchView f184519X;

    /* JADX INFO: renamed from: Y */
    public final SearchableInfo f184520Y;

    /* JADX INFO: renamed from: Z */
    public final Context f184521Z;

    /* JADX INFO: renamed from: h */
    public final int f184522h;

    /* JADX INFO: renamed from: i */
    public final int f184523i;

    /* JADX INFO: renamed from: t */
    public final LayoutInflater f184524t;

    public q261(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f227974b = true;
        this.f227975c = null;
        this.f227973a = false;
        this.f227976d = -1;
        this.f227977e = new s8m(this);
        this.f227978f = new t8m(this, 0);
        this.f184523i = suggestionRowLayout;
        this.f184522h = suggestionRowLayout;
        this.f184524t = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f184511N0 = 1;
        this.f184513P0 = -1;
        this.f184514Q0 = -1;
        this.f184515R0 = -1;
        this.f184516S0 = -1;
        this.f184517T0 = -1;
        this.f184518U0 = -1;
        this.f184519X = searchView;
        this.f184520Y = searchableInfo;
        this.f184510M0 = searchView.getSuggestionCommitIconResId();
        this.f184521Z = context;
        this.f184509L0 = weakHashMap;
    }

    /* JADX INFO: renamed from: i */
    public static String m71984i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.u8m
    /* JADX INFO: renamed from: a */
    public final void mo71985a(View view, Cursor cursor) {
        int i;
        Drawable drawableM71990g;
        CharSequence charSequenceM71984i;
        p261 p261Var = (p261) view.getTag();
        int i2 = this.f184518U0;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = p261Var.f173258a;
        TextView textView2 = p261Var.f173259b;
        ImageView imageView = p261Var.f173262e;
        if (textView != null) {
            String strM71984i = m71984i(cursor, this.f184513P0);
            textView.setText(strM71984i);
            if (TextUtils.isEmpty(strM71984i)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f184521Z;
        if (textView2 != null) {
            String strM71984i2 = m71984i(cursor, this.f184515R0);
            if (strM71984i2 != null) {
                if (this.f184512O0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f184512O0 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM71984i2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f184512O0, null), 0, strM71984i2.length(), 33);
                charSequenceM71984i = spannableString;
            } else {
                charSequenceM71984i = m71984i(cursor, this.f184514Q0);
            }
            if (TextUtils.isEmpty(charSequenceM71984i)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceM71984i);
            if (TextUtils.isEmpty(charSequenceM71984i)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = p261Var.f173260c;
        if (imageView2 != null) {
            int i4 = this.f184516S0;
            if (i4 == -1) {
                drawableM71990g = null;
            } else {
                drawableM71990g = m71990g(cursor.getString(i4));
                if (drawableM71990g == null) {
                    ComponentName searchActivity = this.f184520Y.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f184509L0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableM71990g = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableM71990g = null;
                                } else {
                                    drawableM71990g = drawable;
                                }
                            } else {
                                drawableM71990g = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableM71990g == null ? null : drawableM71990g.getConstantState());
                    }
                    if (drawableM71990g == null) {
                        drawableM71990g = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableM71990g);
            if (drawableM71990g == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableM71990g.setVisible(false, false);
                drawableM71990g.setVisible(true, false);
            }
        }
        ImageView imageView3 = p261Var.f173261d;
        if (imageView3 == null) {
            i = 1;
        } else {
            int i5 = this.f184517T0;
            Drawable drawableM71990g2 = i5 == -1 ? null : m71990g(cursor.getString(i5));
            imageView3.setImageDrawable(drawableM71990g2);
            if (drawableM71990g2 == null) {
                imageView3.setVisibility(8);
                i = 1;
            } else {
                imageView3.setVisibility(0);
                drawableM71990g2.setVisible(false, false);
                i = 1;
                drawableM71990g2.setVisible(true, false);
            }
        }
        int i6 = this.f184511N0;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // p204p.u8m
    /* JADX INFO: renamed from: b */
    public final void mo71986b(Cursor cursor) {
        try {
            super.mo71986b(cursor);
            if (cursor != null) {
                this.f184513P0 = cursor.getColumnIndex("suggest_text_1");
                this.f184514Q0 = cursor.getColumnIndex("suggest_text_2");
                this.f184515R0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f184516S0 = cursor.getColumnIndex("suggest_icon_1");
                this.f184517T0 = cursor.getColumnIndex("suggest_icon_2");
                this.f184518U0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p204p.u8m
    /* JADX INFO: renamed from: c */
    public final String mo71987c(Cursor cursor) {
        String strM71984i;
        String strM71984i2;
        if (cursor == null) {
            return null;
        }
        String strM71984i3 = m71984i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM71984i3 != null) {
            return strM71984i3;
        }
        SearchableInfo searchableInfo = this.f184520Y;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM71984i2 = m71984i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM71984i2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM71984i = m71984i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM71984i;
    }

    @Override // p204p.u8m
    /* JADX INFO: renamed from: d */
    public final View mo71988d(ViewGroup viewGroup) {
        View viewInflate = this.f184524t.inflate(this.f184522h, viewGroup, false);
        viewInflate.setTag(new p261(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f184510M0);
        return viewInflate;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m71989f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f184521Z.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m71990g(String str) {
        WeakHashMap weakHashMap = this.f184509L0;
        Context context = this.f184521Z;
        Drawable drawableM71989f = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM71989f = m71989f(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                            drawableM71989f = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused5) {
                                uri.toString();
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e) {
                    Objects.toString(uri);
                    e.getMessage();
                }
                if (drawableM71989f != null) {
                    weakHashMap.put(str, drawableM71989f.getConstantState());
                }
            }
        }
        return drawableM71989f;
    }

    @Override // p204p.u8m, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewInflate = this.f184524t.inflate(this.f184523i, viewGroup, false);
            if (viewInflate != null) {
                ((p261) viewInflate.getTag()).f173258a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p204p.u8m, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo71988d = mo71988d(viewGroup);
            ((p261) viewMo71988d.getTag()).f173258a.setText(e.toString());
            return viewMo71988d;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Cursor m71991h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f184521Z.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f227975c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f227975c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f184519X.m140q((CharSequence) tag);
        }
    }
}

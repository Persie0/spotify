package androidx.car.app.model;

import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.klh;
import p204p.rzb;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CarText {
    private final List<SpanWrapper> mSpans;
    private final List<List<SpanWrapper>> mSpansForVariants;
    private final String mText;
    private final List<String> mTextVariants;

    @rzb
    public static final class Builder {
        CharSequence mText;
        List<CharSequence> mTextVariants = new ArrayList();

        public Builder(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.mText = charSequence;
        }

        public Builder addVariant(CharSequence charSequence) {
            List<CharSequence> list = this.mTextVariants;
            Objects.requireNonNull(charSequence);
            list.add(charSequence);
            return this;
        }

        public CarText build() {
            return new CarText(this);
        }
    }

    private CarText() {
        this.mText = "";
        List list = Collections.EMPTY_LIST;
        this.mSpans = list;
        this.mTextVariants = list;
        this.mSpansForVariants = list;
    }

    public static CarText create(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new CarText(charSequence);
    }

    private static CharSequence getCharSequence(String str, List<SpanWrapper> list) {
        SpannableString spannableString = new SpannableString(str);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (SpanWrapper spanWrapper : list) {
            spannableString.setSpan(spanWrapper.getCarSpan(), spanWrapper.getStart(), spanWrapper.getEnd(), spanWrapper.getFlags());
        }
        return spannableString;
    }

    public static boolean isNullOrEmpty(CarText carText) {
        return carText == null || carText.isEmpty();
    }

    public static String toShortString(CarText carText) {
        if (carText == null) {
            return null;
        }
        String string = carText.toString();
        if (string.length() <= 16) {
            return string;
        }
        return string.substring(0, 8) + "~" + string.substring(string.length() - 8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarText)) {
            return false;
        }
        CarText carText = (CarText) obj;
        return Objects.equals(this.mText, carText.mText) && Objects.equals(this.mSpans, carText.mSpans) && Objects.equals(this.mTextVariants, carText.mTextVariants) && Objects.equals(this.mSpansForVariants, carText.mSpansForVariants);
    }

    public List<SpanWrapper> getSpans() {
        return this.mSpans;
    }

    public List<List<SpanWrapper>> getSpansForVariants() {
        return this.mSpansForVariants;
    }

    public List<CharSequence> getVariants() {
        if (this.mTextVariants.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mTextVariants.size(); i++) {
            arrayList.add(getCharSequence(this.mTextVariants.get(i), this.mSpansForVariants.get(i)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return Objects.hash(this.mText, this.mSpans, this.mTextVariants, this.mSpansForVariants);
    }

    public boolean isEmpty() {
        return this.mText.isEmpty();
    }

    public CharSequence toCharSequence() {
        return getCharSequence(this.mText, this.mSpans);
    }

    public String toString() {
        return this.mText;
    }

    private static List<SpanWrapper> getSpans(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                if (obj instanceof CarSpan) {
                    arrayList.add(new SpanWrapper(spanned, (CarSpan) obj));
                }
            }
        }
        return wdg1.m87845s(arrayList);
    }

    @rzb
    public static class SpanWrapper {
        private final CarSpan mCarSpan;
        private final int mEnd;
        private final int mFlags;
        private final int mStart;

        public SpanWrapper(Spanned spanned, CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanWrapper)) {
                return false;
            }
            SpanWrapper spanWrapper = (SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && Objects.equals(this.mCarSpan, spanWrapper.mCarSpan);
        }

        public CarSpan getCarSpan() {
            return this.mCarSpan;
        }

        public int getEnd() {
            return this.mEnd;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public int getStart() {
            return this.mStart;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mStart), Integer.valueOf(this.mEnd), Integer.valueOf(this.mFlags), this.mCarSpan);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.mCarSpan);
            sb.append(": ");
            sb.append(this.mStart);
            sb.append(", ");
            sb.append(this.mEnd);
            sb.append(", flags: ");
            return klh.m56832d(this.mFlags, "]", sb);
        }

        public SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new CarSpan();
        }
    }

    public CarText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        this.mSpans = getSpans(charSequence);
        List list = Collections.EMPTY_LIST;
        this.mTextVariants = list;
        this.mSpansForVariants = list;
    }

    public CarText(Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = getSpans(builder.mText);
        List<CharSequence> list = builder.mTextVariants;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = list.get(i);
            arrayList.add(charSequence.toString());
            arrayList2.add(getSpans(charSequence));
        }
        this.mTextVariants = wdg1.m87845s(arrayList);
        this.mSpansForVariants = wdg1.m87845s(arrayList2);
    }
}

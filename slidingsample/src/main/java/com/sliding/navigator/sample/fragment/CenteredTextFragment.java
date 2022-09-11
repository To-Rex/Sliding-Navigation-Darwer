package com.sliding.navigator.sample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sliding.navigator.sample.R;


public class CenteredTextFragment extends Fragment {

    private static final String EXTRA_TEXT = "text";

    public static CenteredTextFragment createFor(String text) {
        CenteredTextFragment fragment = new CenteredTextFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        assert args != null;
        String text = args.getString(EXTRA_TEXT);
        Toast.makeText(getActivity(), args.getString("text"), Toast.LENGTH_SHORT).show();
        if (text.equals(getString(R.string.one))) {
            return inflater.inflate(R.layout.dashbord, container, false);
        }
        if (text.equals(getString(R.string.two))) {
            return inflater.inflate(R.layout.myaccaunt, container, false);
        }
        if (text.equals(getString(R.string.tree))) {
            return inflater.inflate(R.layout.messages, container, false);
        }
        if (text.equals(getString(R.string.four))) {
            return inflater.inflate(R.layout.chart, container, false);
        } else {
            return inflater.inflate(R.layout.dashbord, container, false);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        final String text = args != null ? args.getString(EXTRA_TEXT) : "";
    }
}
